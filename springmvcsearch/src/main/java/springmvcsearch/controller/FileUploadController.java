package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/file")
	public String showUploadForm() {
		
		return "fileform";
	}
	
	@RequestMapping(path = "/upload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file,HttpSession s,Model m) {//the CommonsMultipartFile holds the file coming from form
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		// get the file content so it can upload later
		byte [] data = file.getBytes();
		//find path of the file
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"views"+File.separator+"resources"+File.separator+
				"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		
		//we have to write/upload data to the path 
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File uploaded successfully");
		m.addAttribute("msg", "Uploaded successfully");
		m.addAttribute("filename", file.getOriginalFilename());
		
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error in uploading file");
			m.addAttribute("msg", "error while uploading");
		}
		
		return "filesuccess";
	}

}
