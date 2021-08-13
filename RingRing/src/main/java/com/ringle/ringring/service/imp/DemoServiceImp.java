package com.ringle.ringring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ringle.ringring.entity.DemoEntity;
import com.ringle.ringring.repository.DemoRepository;
import com.ringle.ringring.service.DemoService;

@Service
public class DemoServiceImp implements DemoService {

	@Autowired
	DemoRepository demoRepository;

	@Override
	public List<DemoEntity> getAllDemo() {
		return demoRepository.findAll();
	}

	@Override
	public void saveDemo(DemoEntity demoEntity) {
		demoRepository.save(demoEntity);
	}
}
