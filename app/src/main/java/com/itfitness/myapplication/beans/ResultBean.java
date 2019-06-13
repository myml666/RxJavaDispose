package com.itfitness.myapplication.beans;

import java.util.List;

/**
 * @ProjectName: RxJavaDispose
 * @Package: com.itfitness.myapplication.beans
 * @ClassName: ResultBean
 * @Description: java类作用描述 ：
 * @Author: 作者名：lml
 * @CreateDate: 2019/6/13 11:11
 * @UpdateUser: 更新者：
 * @UpdateDate: 2019/6/13 11:11
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */

public class ResultBean {

    /**
     * code : 0
     * data : [{"bid":2,"videodetailsurl":"http://www.zxziyuan.com/?m=vod-detail-id-9121.html","videoimg":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557142395166&di=cadd833ab15b4870c369ba3b9976eeb8&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fec49c0c88e384c5f856406c04d3d6c133f68335c28759-V6LlbU_fw658","videoname":"斗罗大陆"},{"bid":3,"videodetailsurl":"http://www.zxziyuan.com/?m=vod-detail-id-21444.html","videoimg":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557142545663&di=dc57eea5269ba51b46c46d16e95578f3&imgtype=0&src=http%3A%2F%2Ffile002.gao7.com%2Fg2%2FM00%2FAC%2F29%2FEScAAFseQ_KAa2gWAAOgwKroTv0309.jpg%3Fw%3D680%26h%3D383","videoname":"雪鹰领主"},{"bid":4,"videodetailsurl":"http://www.zxziyuan.com/?m=vod-detail-id-24522.html","videoimg":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557142572665&di=fa0694709d52b712495884d75a44bf03&imgtype=0&src=http%3A%2F%2Fdingyue.nosdn.127.net%2FWtkteTwypXWcUcVgNNbPflfSjKWQHNk%3DyYtKJo7yYOIqx1536055370416.jpg","videoname":"复仇者联盟4"}]
     * msg : 查询成功
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * bid : 2
         * videodetailsurl : http://www.zxziyuan.com/?m=vod-detail-id-9121.html
         * videoimg : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557142395166&di=cadd833ab15b4870c369ba3b9976eeb8&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fec49c0c88e384c5f856406c04d3d6c133f68335c28759-V6LlbU_fw658
         * videoname : 斗罗大陆
         */

        private int bid;
        private String videodetailsurl;
        private String videoimg;
        private String videoname;

        public int getBid() {
            return bid;
        }

        public void setBid(int bid) {
            this.bid = bid;
        }

        public String getVideodetailsurl() {
            return videodetailsurl;
        }

        public void setVideodetailsurl(String videodetailsurl) {
            this.videodetailsurl = videodetailsurl;
        }

        public String getVideoimg() {
            return videoimg;
        }

        public void setVideoimg(String videoimg) {
            this.videoimg = videoimg;
        }

        public String getVideoname() {
            return videoname;
        }

        public void setVideoname(String videoname) {
            this.videoname = videoname;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "bid=" + bid +
                    ", videodetailsurl='" + videodetailsurl + '\'' +
                    ", videoimg='" + videoimg + '\'' +
                    ", videoname='" + videoname + '\'' +
                    '}';
        }
    }
}
