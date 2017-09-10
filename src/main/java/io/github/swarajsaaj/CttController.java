package io.github.swarajsaaj;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CttController {

	@GetMapping("/")
	public Map<String,String> getData(){
		Map<String,String> retMap = new HashMap<>();
		retMap.put("time", String.valueOf(Calendar.getInstance().getTimeInMillis()));
		retMap.put("assignment", "CTT DevOps");
		return retMap;
	}
	
}
