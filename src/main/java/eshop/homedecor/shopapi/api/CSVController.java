package eshop.homedecor.shopapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import eshop.homedecor.shopapi.entity.ProductInfo;
import eshop.homedecor.shopapi.service.impl.CSVService;
import eshop.homedecor.shopapi.vo.helper.CSVHelper;
import eshop.homedecor.shopapi.vo.helper.ResponseMessage;

@CrossOrigin
@Controller
@RequestMapping("/csv")
public class CSVController {

	@Autowired
	CSVService fileService;

	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";
		return null;
	}
}
