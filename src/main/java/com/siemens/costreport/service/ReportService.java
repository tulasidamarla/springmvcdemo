package com.siemens.costreport.service;

import java.util.List;

import com.siemens.costreport.model.CostElement;
import com.siemens.costreport.model.VMDetails;

public interface ReportService {
	
	
	List<CostElement> findAllCostElements();
	
	List<VMDetails> findAllVMDetails();

}
