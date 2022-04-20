package hcmute.edu.vn.PhamVanManhHung_19110081_todolist;

public class Job {
    private  int JobId;
    private String JobName;

    public Job(int jobId, String jobName){
        JobId = jobId;
        JobName = jobName;

    }

    public int getJobId() {
        return JobId;
    }

    public void setJobId(int jobId) {
        JobId = jobId;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }
}
