package com.EngineImplementations.java;

import org.springframework.stereotype.Component;
import com.EngineInterface.java.Engine;
@Component
public class DieselEngine implements Engine{
	@Override
	public String getEngineType() {
		// TODO Auto-generated method stub
		return "DieselEngine";
	}
}
