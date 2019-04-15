package commons;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

public class ServiceResponse implements Serializable {
    protected JSONObject data;
    protected String code;
    protected String msg;

    public <T> T put(String key, T value){
        if(null == data) {
            data = new JSONObject();
        }
        return (T) data.put(key, value);
    }

    public <T> T get(String key) {
        if(null == data) {
            data = new JSONObject();
        }
        return (T)data.get(key);
    }
}
