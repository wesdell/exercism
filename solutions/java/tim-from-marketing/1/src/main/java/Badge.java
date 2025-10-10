class Badge {
    
    public String print(Integer id, String name, String department) {
        String idBadge = "[" + String.valueOf(id) + "] - ";
        if (department == null && id == null) {
            return name + " - OWNER";
        } else if (department == null) {
            return idBadge + name + " - OWNER";
        }
        
        String defaultBadge = name + " - " + department.toUpperCase();
        if (id == null) {
            return defaultBadge;
        }
        return idBadge + defaultBadge;
    }
    
}
