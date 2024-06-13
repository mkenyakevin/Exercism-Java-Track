class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder badge = new StringBuilder();

        if (id == null & department == null) {
            badge.append(name);
            badge.append(" - ");
            badge.append("OWNER");
        } else if (id == null & department != null) {
            badge.append(name);
            badge.append(" - ");
            badge.append(department.toUpperCase());
        } else if (department == null) {
            badge.append("[").append(id).append("] - ").append(name).append(" - ").append("OWNER");
        }else {
            badge.append("[").append(id).append("] - ").append(name).append(" - ").append(department.toUpperCase());
        }
        return badge.toString();
    }
}
