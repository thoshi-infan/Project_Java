class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return this.birdsPerDay;            
    }   
    public int getToday() {
        if (this.birdsPerDay.length ==0 ){
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }
    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] ++;
    }
    
    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0){
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int  numberOfBirds = 0;
        if (numberOfDays < this.birdsPerDay.length ){
            for (int i = 0 ; i < numberOfDays ; i++){
                numberOfBirds += this.birdsPerDay[i];
            }
        } else{
            for (int i = 0 ; i < this.birdsPerDay.length ; i++){
                numberOfBirds += this.birdsPerDay[i];
            }
        }
        return numberOfBirds;
    }
    public int getBusyDays() {
        int  busyDays = 0;
        for (int i = 0 ; i < this.birdsPerDay.length - 1; i++){
            if (this.birdsPerDay[i] >= 5){
                busyDays ++;
            }
        }
        return busyDays;
    }
}
