public enum Seasons {
    WINTER(-2), SPRING(10.1), SUMMER(22){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    }, FALL(9.8);
    double avgTemperature;

    Seasons(double avgTemperature){
        this.avgTemperature = avgTemperature;
    }
    Seasons(){}
    public String getAvgTemperature(){
        return String.valueOf(this.avgTemperature);
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
