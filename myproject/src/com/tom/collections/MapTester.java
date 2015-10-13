package com.tom.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("2330", "台積電");
		map.put("3008", "大立光");
//		map.put("2330", "哈哈哈");
		System.out.println(map);
		System.out.println(map.size());
		Set<String> keys = map.keySet();
		for (String key: keys){
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println(map.get("1234"));
		if (map.containsKey("2330")){
			
		}
		if (map.get("2330")!=null){
			
		}
	}
}
