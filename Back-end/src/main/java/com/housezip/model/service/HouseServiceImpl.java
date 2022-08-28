package com.housezip.model.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housezip.dto.Avgamount;
import com.housezip.dto.House;
import com.housezip.dto.InterestDeal;
import com.housezip.dto.SearchCondition;
import com.housezip.model.repo.HouseRepo;
import com.housezip.model.repo.InterestDealRepo;
import com.housezip.util.PageNavigation;

@Service
public class HouseServiceImpl implements HouseService {
	
	@Autowired
	public HouseRepo repo;
	
	@Override
	public List<House> selectAptCode(String userid, String aptCode){
		return repo.selectAptCode(userid, aptCode);
	}
	
	@Override
	public House select(int no){
		return repo.select(no);
	}
	@Override
	public List<House> selectDong(String dong) {
		return repo.selectDong(dong);
	}
	@Override
	public List<House> selectApt(String aptCode) {
		return repo.selectApt(aptCode);
	}

	@Override
	public List<House> selectGugun(String gugun) {
		return repo.selectGugun(gugun);
	}
	@Override
	public List<House> selectDist(String lat, String lng, String dist) {
		return repo.selectDist(lat, lng, dist);
	}

	@Override
	public List<House> selectInte(List<String> aptCode) {
		return repo.selectInte(aptCode);
	}

	@Override
	public List<Avgamount> getAvgAll() {
		return repo.getAvgAll();
	}

	@Override
	public List<Avgamount> getAvgSido(String dongCode) {
		return repo.getAvgSido(dongCode);
	}

	@Override
	public List<Avgamount> getAvgGugun(String dongCode) {
		return repo.getAvgGugun(dongCode);
	}

	@Override
	public List<Avgamount> getAvgDong(String dongCode) {
		return repo.getAvgDong(dongCode);
	}

}
