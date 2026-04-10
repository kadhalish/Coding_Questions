package com.test.geeks;
import java.math.BigDecimal;
import java.util.*;
 

/*{
	  "Apple": 3.50,
	  "Banana": 1.25,
	  "orange" : 1.00
	}*/


public class ProductPriceAggregator {
 
    public static void main(String[] args) {

        List<String> transactions = Arrays.asList(
                "Apple:1.20",
                "Banana:0.50",
                "Apple:2.30",
                "Banana:0.75",
                "Orange:1.00"
        );
 
		
        Map<String, BigDecimal> result = aggregatePrices(transactions);
 
        
        System.out.println("Aggregated Product Prices:");
        for (Map.Entry<String, BigDecimal> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
 
    public static Map<String, BigDecimal> aggregatePrices(List<String> transactions) {
        Map<String, BigDecimal> priceMap = new HashMap<>();
        for(String transaction : transactions) {
        	String[] fruitPrice = transaction.split(":");
        	String fruitName = fruitPrice[0];
        	BigDecimal decimal = new BigDecimal(fruitPrice[1]);
        	if(priceMap.containsKey(fruitName)) {
        		BigDecimal newPrice = priceMap.get(fruitName).add(decimal);
        		priceMap.put(fruitName, newPrice);
        	}
        	
        	priceMap.putIfAbsent(fruitName, decimal);
        }
        return priceMap;
    }
    
    
}