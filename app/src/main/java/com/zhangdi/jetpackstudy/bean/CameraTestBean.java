package com.zhangdi.jetpackstudy.bean;

/**
 * author: zhangdi45
 * Date: 11:33 2023/10/7
 */
public class CameraTestBean extends TestBaseBean {
    private int cameraId;

    public CameraTestBean(String title, int cameraId) {
        super(title);
        this.cameraId = cameraId;
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }
}
