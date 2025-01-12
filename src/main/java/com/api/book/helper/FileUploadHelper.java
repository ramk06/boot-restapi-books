package com.api.book.helper;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final String UPLOAD_DIR="C:\\Users\\USER\\Desktop\\SpringBoot\\spring-boot-rest-api\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multipart) {
		boolean f = false;
		
		try 
		{
			InputStream is = multipart.getInputStream();
			byte data[] = new byte[is.available()];
			is.read(data);
			
			// write 
			FileOutputStream fos  = new FileOutputStream(UPLOAD_DIR+"\\"+multipart.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			f = true;
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
}

