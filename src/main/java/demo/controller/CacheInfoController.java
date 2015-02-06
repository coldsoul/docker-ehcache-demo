package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CacheInfoController {



	@RequestMapping("/cacheInfo")
	@ResponseBody
	public int cacheInfo() {
		return 1;
	}
}
