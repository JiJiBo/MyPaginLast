package com.rulerbug.mypaginlast;

import java.util.List;

public class JockBean {
    /**
     * code : 200
     * message : 成功!
     * result : [{"sid":"31538081","text":"从头到脚都精致的女神，娶回家舍得让她做家务吗？","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0729/5f20d97a78be5_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0729/5f20d97a78be5_wpd.mp4","images":null,"up":"108","down":"14","forward":"0","comment":"41","uid":"23129497","name":"你的意义","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d74f678a8d_mini.jpg","top_comments_content":"都给你们惯的","top_comments_voiceuri":"","top_comments_uid":"5653794","top_comments_name":"宅小优","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2018/04/27/5ae339e226c00_mini.jpg","passtime":"2020-08-06 19:59:07"},{"sid":"31519270","text":"异地恋见面。。。","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0727/5f1e3e4476f5c_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0727/5f1e3e4476f5c_wpd.mp4","images":null,"up":"188","down":"7","forward":"2","comment":"39","uid":"23126132","name":"繁繁","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d6ae649982_mini.jpg","top_comments_content":"不着痕迹的先让你闻闻","top_comments_voiceuri":"","top_comments_uid":"20438036","top_comments_name":"悲fsE","top_comments_header":"http://wx.qlogo.cn/mmopen/NsXicLUicickpel973x87uu1K1yvImsHaJqUrmaqzWjUU4s2M7JxUkQowKQ9p0jnoRMc2p2VuwXp1OkeSmRTPQiarmM9zibEAx2NY/0","passtime":"2020-08-06 19:29:05"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * sid : 31538081
         * text : 从头到脚都精致的女神，娶回家舍得让她做家务吗？
         * type : video
         * thumbnail : http://wimg.spriteapp.cn/picture/2020/0729/5f20d97a78be5_wpd.jpg
         * video : http://uvideo.spriteapp.cn/video/2020/0729/5f20d97a78be5_wpd.mp4
         * images : null
         * up : 108
         * down : 14
         * forward : 0
         * comment : 41
         * uid : 23129497
         * name : 你的意义
         * header : http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d74f678a8d_mini.jpg
         * top_comments_content : 都给你们惯的
         * top_comments_voiceuri :
         * top_comments_uid : 5653794
         * top_comments_name : 宅小优
         * top_comments_header : http://wimg.spriteapp.cn/profile/large/2018/04/27/5ae339e226c00_mini.jpg
         * passtime : 2020-08-06 19:59:07
         */

        private String sid;
        private String text;
        private String type;
        private String thumbnail;
        private String video;
        private Object images;
        private String up;
        private String down;
        private String forward;
        private String comment;
        private String uid;
        private String name;
        private String header;
        private String top_comments_content;
        private String top_comments_voiceuri;
        private String top_comments_uid;
        private String top_comments_name;
        private String top_comments_header;
        private String passtime;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(String top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public String getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(String top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public String getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(String top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public String getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(String top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public String getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(String top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }
}
