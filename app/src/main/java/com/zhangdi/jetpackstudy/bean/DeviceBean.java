package com.zhangdi.jetpackstudy.bean;



import androidx.annotation.ColorInt;
import androidx.databinding.BaseObservable;


public class DeviceBean extends BaseObservable {
    private String softVersion;
    private @ColorInt int softVersionColor;
    private String serial;
    private @ColorInt int serialColor;

    private String barCode;
    private @ColorInt int barCodeColor;
    private String imei1;
    private @ColorInt int imei1Color;
    private String imei2;
    private @ColorInt int imei2Color;
    private String wifiMac;
    private @ColorInt int wifiMacColor;
    private String btMac;
    private @ColorInt int btMacColor;
    private String storage;
    private @ColorInt int storageColor;
    private String sd1Status;
    private @ColorInt int sd1StatusColor;
    private String sd1All;
    private @ColorInt int sd1AllColor;
    private String sd1Available;
    private @ColorInt int sd1AvailableColor;
    private String sd2Status;
    private @ColorInt int sd2StatusColor;

    private String sd2All;

    private @ColorInt int sd2AllColor;
    private String sd2Available;
    private @ColorInt int sd2AvailableColor;

    public DeviceBean() {
    }

    public String getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    public int getSoftVersionColor() {
        return softVersionColor;
    }

    public void setSoftVersionColor(int softVersionColor) {
        this.softVersionColor = softVersionColor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getSerialColor() {
        return serialColor;
    }

    public void setSerialColor(int serialColor) {
        this.serialColor = serialColor;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public int getBarCodeColor() {
        return barCodeColor;
    }

    public void setBarCodeColor(int barCodeColor) {
        this.barCodeColor = barCodeColor;
    }

    public String getImei1() {
        return imei1;
    }

    public void setImei1(String imei1) {
        this.imei1 = imei1;
    }

    public int getImei1Color() {
        return imei1Color;
    }

    public void setImei1Color(int imei1Color) {
        this.imei1Color = imei1Color;
    }

    public String getImei2() {
        return imei2;
    }

    public void setImei2(String imei2) {
        this.imei2 = imei2;
    }

    public int getImei2Color() {
        return imei2Color;
    }

    public void setImei2Color(int imei2Color) {
        this.imei2Color = imei2Color;
    }

    public String getWifiMac() {
        return wifiMac;
    }

    public void setWifiMac(String wifiMac) {
        this.wifiMac = wifiMac;
    }

    public int getWifiMacColor() {
        return wifiMacColor;
    }

    public void setWifiMacColor(int wifiMacColor) {
        this.wifiMacColor = wifiMacColor;
    }

    public String getBtMac() {
        return btMac;
    }

    public void setBtMac(String btMac) {
        this.btMac = btMac;
    }

    public int getBtMacColor() {
        return btMacColor;
    }

    public void setBtMacColor(int btMacColor) {
        this.btMacColor = btMacColor;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getStorageColor() {
        return storageColor;
    }

    public void setStorageColor(int storageColor) {
        this.storageColor = storageColor;
    }

    public String getSd1Status() {
        return sd1Status;
    }

    public void setSd1Status(String sd1Status) {
        this.sd1Status = sd1Status;
    }

    public int getSd1StatusColor() {
        return sd1StatusColor;
    }

    public void setSd1StatusColor(int sd1StatusColor) {
        this.sd1StatusColor = sd1StatusColor;
    }

    public String getSd1All() {
        return sd1All;
    }

    public void setSd1All(String sd1All) {
        this.sd1All = sd1All;
    }

    public int getSd1AllColor() {
        return sd1AllColor;
    }

    public void setSd1AllColor(int sd1AllColor) {
        this.sd1AllColor = sd1AllColor;
    }

    public String getSd1Available() {
        return sd1Available;
    }

    public void setSd1Available(String sd1Available) {
        this.sd1Available = sd1Available;
    }

    public int getSd1AvailableColor() {
        return sd1AvailableColor;
    }

    public void setSd1AvailableColor(int sd1AvailableColor) {
        this.sd1AvailableColor = sd1AvailableColor;
    }

    public String getSd2Status() {
        return sd2Status;
    }

    public void setSd2Status(String sd2Status) {
        this.sd2Status = sd2Status;
    }

    public int getSd2StatusColor() {
        return sd2StatusColor;
    }

    public void setSd2StatusColor(int sd2StatusColor) {
        this.sd2StatusColor = sd2StatusColor;
    }

    public String getSd2All() {
        return sd2All;
    }

    public void setSd2All(String sd2All) {
        this.sd2All = sd2All;
    }

    public int getSd2AllColor() {
        return sd2AllColor;
    }

    public void setSd2AllColor(int sd2AllColor) {
        this.sd2AllColor = sd2AllColor;
    }

    public String getSd2Available() {
        return sd2Available;
    }

    public void setSd2Available(String sd2Available) {
        this.sd2Available = sd2Available;
    }

    public int getSd2AvailableColor() {
        return sd2AvailableColor;
    }

    public void setSd2AvailableColor(int sd2AvailableColor) {
        this.sd2AvailableColor = sd2AvailableColor;
        notifyChange();
    }


}
