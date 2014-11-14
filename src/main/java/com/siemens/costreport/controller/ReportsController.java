package com.siemens.costreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siemens.costreport.service.ReportService;

@Controller
public class ReportsController {

	@Autowired
	private ReportService service;

	@RequestMapping("/costElementlist")
	public String getCostElements(Model model) {
		model.addAttribute("reportsList", service.findAllCostElements());
		return "report";
	}

	@RequestMapping("/vmList")
	public String getVMDetails(Model model) {
		model.addAttribute("vmList", service.findAllVMDetails());
		return "vmDetails";
	}

}
