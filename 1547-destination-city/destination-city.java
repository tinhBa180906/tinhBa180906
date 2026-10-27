class Solution {
    public String destCity(List<List<String>> paths) {
         Set<String> desMap = new HashSet<>();
        for (List<String> path : paths) {
            desMap.add(path.get(0));
        }
        
        
        for (List<String> path : paths) {
            if(!desMap.contains(path.get(1))) return path.get(1);
        }
        
        return "";
    }
}