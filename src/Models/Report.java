package Models;

public class Report {
    int r_id ;
    String remark ;
    String score ;
    String tranning_name ;
    int inst_id ;
    int stu_id ;

    public Report(int r_id, String remark, String score, String tranning_name, int inst_id, int stu_id) {
        this.r_id = r_id;
        this.remark = remark;
        this.score = score;
        this.tranning_name = tranning_name;
        this.inst_id = inst_id;
        this.stu_id = stu_id;
    }
    public Report (){

    }
    public int getR_id() {
        return r_id;
    }

    public void SetR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getRemark() {
        return remark;
    }

    public void SetRemark(String remark) {
        this.remark = remark;
    }

    public String getScore() {
        return score;
    }

    public void SetScore(String score) {
        this.score = score;
    }

    public String getTranning_name() {
        return tranning_name;
    }

    public void SetTranning_name(String tranning_name) {
        this.tranning_name = tranning_name;
    }

    public int getInst_id() {
        return inst_id;
    }

    public void SetInst_id(int inst_id) {
        this.inst_id = inst_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void SetStu_id(int stu_id) {
        this.stu_id = stu_id;
    }



}
