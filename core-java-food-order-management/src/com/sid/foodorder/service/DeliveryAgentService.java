package com.sid.foodorder.service;

import com.sid.foodorder.model.DeliveryAgent;

import java.util.HashMap;
import java.util.Map;

public class DeliveryAgentService {
    private Map<String, DeliveryAgent> deliveryAgentMap = new HashMap<>();

    public void registerAgent(DeliveryAgent agent) {
        deliveryAgentMap.put(agent.getId(), agent);
        System.out.println("✅ Registered: " + agent.getFirstName() + " " + agent.getLastName());
    }

    public void updateAgent(String id, String mobile, String address, String kyc) {
        DeliveryAgent agent = deliveryAgentMap.get(id);
        if (agent != null) {
            agent.setMobile(mobile);
            agent.setAddress(address);
            agent.setKyc(kyc);
            System.out.println("📝 Updated: " + agent);
        } else {
            System.out.println("⚠️ Delivery Agent not found.");
        }
    }

    public void showAllAgents() {
        for (DeliveryAgent agent : deliveryAgentMap.values()) {
            System.out.println(agent);
        }
    }
}
