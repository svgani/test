package com.nxp.hcedemomws.rest;

import com.nxp.hcedemomws.dto.TransitBundle;
import com.nxp.hcedemomws.util.JsonUtil;

public class TestJson {

	public static void main(String[] args) {
		TransitBundle tb = new TransitBundle();
		 System.out.println(JsonUtil.toJSON(tb));
	}

}
