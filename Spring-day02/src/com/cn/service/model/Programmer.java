package com.cn.service.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zz
 */
public class Programmer {
    private List<String> cars;
    private Set<String> pats;
    private Map<String,String> infos;
    private Properties myInfos;

    private String [] members;

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public Properties getMyInfos() {
        return myInfos;
    }

    public void setMyInfos(Properties myInfos) {
        this.myInfos = myInfos;
    }

    public Map<String, String> getInfos() {
        return infos;
    }

    public void setInfos(Map<String, String> infos) {
        this.infos = infos;
    }

    public Set<String> getPats() {
        return pats;
    }

    public void setPats(Set<String> pats) {
        this.pats = pats;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }


}
