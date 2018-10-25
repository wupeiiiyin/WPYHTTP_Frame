package com.example.administrator.demoapi32test;

import java.util.List;

public class newsListBean {

    /**
     * Code : 0
     * Total : 137
     * Status : true
     * Message : 请求成功
     * Data : [{"Id":3170,"CourseStar":1,"CourseBanner":"http://static2.risfond.com/Course/Images/2018/201810/20181024/4ae26e10747e4a00a92fa124accccccf微信图片_20181023145342.jpg","Title":"测试达人网校添加课程","Teacher":"","Desc":"添加3个成员、所属分类  操作指南  哈哈哈  溜达第六届埃里克发简历到防静电啦防静电啦费加大了","TrainingObjectName":"","KechengFeatureName":"","ShowNum":14,"CreatedTime":"2018.10.22","Detail":[]},{"Id":3169,"CourseStar":0,"CourseBanner":"http://static2.risfond.com/Course/Images/2018/201810/20181024/dd648f7c6c4149dbbba2fe856b9c4d14微信图片_20181024125620.jpg","Title":"测试大文件","Teacher":"123123","Desc":"测试大文件测试大文件测试大文件测试大文件测试大文件测试大文件","TrainingObjectName":"","KechengFeatureName":"","ShowNum":8,"CreatedTime":"2018.10.19","Detail":[]},{"Id":3168,"CourseStar":0,"CourseBanner":"http://static2.risfond.com/Course/Images/0d7d50759ddd4c3ab301a1ea096f510600sh.jpg","Title":"回归测试bug","Teacher":"","Desc":"放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福放散阀法法法发发发发发附件啊考虑交付了附件阿里及发放交付附件啊速度家里家乐福","TrainingObjectName":"","KechengFeatureName":"","ShowNum":21,"CreatedTime":"2018.10.19","Detail":[]},{"Id":3167,"CourseStar":1,"CourseBanner":"http://static2.risfond.com/Course/Images/0db0fd6c957747d3899110ba4cdf2f26hydrangeas.jpg","Title":"员工职业规划","Teacher":"","Desc":"当地良好的客户资源，能实现对产品用户群的快速扩张当地良好的客户资源，能实现对产品用户群的快速扩张当地良好的客户资源，能实现对产品用户群的快速扩张当地良好的客户资源，能实现对产品用户群的快速扩张当地良好的客户资源，能实现对产品用户群的快速扩张当地良好的客户资源，能实现对产品用户群的快速扩张","TrainingObjectName":"","KechengFeatureName":"","ShowNum":2,"CreatedTime":"2018.10.19","Detail":[]}]
     */

    private int Code;
    private int Total;
    private boolean Status;
    private String Message;
    private List<DataBean> Data;

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * Id : 3170
         * CourseStar : 1
         * CourseBanner : http://static2.risfond.com/Course/Images/2018/201810/20181024/4ae26e10747e4a00a92fa124accccccf微信图片_20181023145342.jpg
         * Title : 测试达人网校添加课程
         * Teacher :
         * Desc : 添加3个成员、所属分类  操作指南  哈哈哈  溜达第六届埃里克发简历到防静电啦防静电啦费加大了
         * TrainingObjectName :
         * KechengFeatureName :
         * ShowNum : 14
         * CreatedTime : 2018.10.22
         * Detail : []
         */

        private int Id;
        private int CourseStar;
        private String CourseBanner;
        private String Title;
        private String Teacher;
        private String Desc;
        private String TrainingObjectName;
        private String KechengFeatureName;
        private int ShowNum;
        private String CreatedTime;
        private List<?> Detail;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public int getCourseStar() {
            return CourseStar;
        }

        public void setCourseStar(int CourseStar) {
            this.CourseStar = CourseStar;
        }

        public String getCourseBanner() {
            return CourseBanner;
        }

        public void setCourseBanner(String CourseBanner) {
            this.CourseBanner = CourseBanner;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTeacher() {
            return Teacher;
        }

        public void setTeacher(String Teacher) {
            this.Teacher = Teacher;
        }

        public String getDesc() {
            return Desc;
        }

        public void setDesc(String Desc) {
            this.Desc = Desc;
        }

        public String getTrainingObjectName() {
            return TrainingObjectName;
        }

        public void setTrainingObjectName(String TrainingObjectName) {
            this.TrainingObjectName = TrainingObjectName;
        }

        public String getKechengFeatureName() {
            return KechengFeatureName;
        }

        public void setKechengFeatureName(String KechengFeatureName) {
            this.KechengFeatureName = KechengFeatureName;
        }

        public int getShowNum() {
            return ShowNum;
        }

        public void setShowNum(int ShowNum) {
            this.ShowNum = ShowNum;
        }

        public String getCreatedTime() {
            return CreatedTime;
        }

        public void setCreatedTime(String CreatedTime) {
            this.CreatedTime = CreatedTime;
        }

        public List<?> getDetail() {
            return Detail;
        }

        public void setDetail(List<?> Detail) {
            this.Detail = Detail;
        }
    }
}
