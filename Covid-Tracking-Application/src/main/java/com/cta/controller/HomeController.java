package com.cta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cta.model.LocationStats;
import com.cta.servise.CoronaVirusDataService;



@Controller
public class HomeController {

	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataService.getAllStats();
		int totalReportedCases = allStats.stream().mapToInt(start -> start.getLatestTotalCases()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		
		return "home";
	} 
}
