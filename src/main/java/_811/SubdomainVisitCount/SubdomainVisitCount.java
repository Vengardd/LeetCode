package _811.SubdomainVisitCount;

import java.util.*;
import java.util.stream.Collectors;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> visitsByDomains = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] splittedValueAndDomains = cpdomain.split(" ");
            Integer value = Integer.valueOf(splittedValueAndDomains[0]);
            String domains = splittedValueAndDomains[1];
            String[] splittedDomains = domains.split("\\.");
            for(int i = 0; i < splittedDomains.length; i++) {
                String actualDomain = createActualDomain(splittedDomains, i);
                if (visitsByDomains.containsKey(actualDomain)) {
                    visitsByDomains.put(actualDomain, visitsByDomains.get(actualDomain) + value);
                } else {
                    visitsByDomains.put(actualDomain, value);
                }
            }
        }
        return visitsByDomains.entrySet().stream()
                .map(entry -> entry.getValue().toString() + " " + entry.getKey())
                .collect(Collectors.toList());
    }

    private String createActualDomain(String[] splittedDomains, int startDomain) {
        StringBuilder sb = new StringBuilder();
        for(int i = startDomain; i < splittedDomains.length - 1; i++) {
            sb.append(splittedDomains[i]);
            sb.append(".");
        }
        sb.append(splittedDomains[splittedDomains.length - 1]);
        return sb.toString();
    }
}

