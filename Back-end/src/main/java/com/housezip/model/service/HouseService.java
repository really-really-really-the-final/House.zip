package com.housezip.model.service;

import java.util.List;
import java.util.Map;

import com.housezip.dto.Avgamount;
import com.housezip.dto.House;
import com.housezip.dto.SearchCondition;

public interface HouseService {
	
	House select(int no);
	List<House> selectGugun(String gugun);
	List<House> selectDong(String dong);
	List<House> selectApt(String aptCode);
	List<House> selectDist(String lat, String lng, String dist);
	List<House> selectAptCode(String userid, String aptCode);
	List<House> selectInte(List<String> aptCode);
	List<Avgamount> getAvgAll();
	List<Avgamount> getAvgSido(String dongCode);
	List<Avgamount> getAvgGugun(String dongCode);
	List<Avgamount> getAvgDong(String dongCode);
}
