package com.siemens.costreport.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.siemens.costreport.model.CostElement;
import com.siemens.costreport.model.VMDetails;
import com.siemens.costreport.repository.CostElementRepository;
import com.siemens.costreport.repository.VMDetailsRepository;

@Service
public class ReportServiceImpl implements ReportService {

	@Resource
	private CostElementRepository costElementRepository;
	
	@Resource
	private VMDetailsRepository vmDetailsRepository;
	
	public List<CostElement> findAllCostElements() {
		 
		return costElementRepository.findAll();
	}

	public List<VMDetails> findAllVMDetails() {
		List<VMDetails> list= vmDetailsRepository.findAll();
		return list;
	}

	

}
