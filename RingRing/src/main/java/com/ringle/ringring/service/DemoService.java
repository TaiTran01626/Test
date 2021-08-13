package com.ringle.ringring.service;

import java.util.List;

import com.ringle.ringring.entity.DemoEntity;

public interface DemoService {

	public List<DemoEntity> getAllDemo();

	public void saveDemo(DemoEntity demoEntity);
}
