package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.PercelInfo;
import tws.repository.PercelInfoMapper;

@Service
public class PercelInfoService {
	@Autowired
	private PercelInfoMapper percelInfoMapper;

	public void addPercel(PercelInfo percelInfo) {
		percelInfoMapper.insert(percelInfo);
	}

}
