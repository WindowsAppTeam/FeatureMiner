package Tagger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ʹ��json-lib����ͽ���Json����
 * 
 * @author Alexia
 * @date 2013/5/23
 *
 */
public class JsonTest {

    /**
     * ����Json����
     * 
     * @return
     */
    public static String BuildJson() {

        // JSON��ʽ���ݽ�������
        JSONObject jo = new JSONObject();

        // ���湹������map��һ��list��һ��Employee����
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "Alexia");
        map1.put("sex", "female");
        map1.put("age", "23");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("name", "Edward");
        map2.put("sex", "male");
        map2.put("age", "24");

        List<Map> list = new ArrayList<Map>();
        list.add(map1);
        list.add(map2);

//        Employee employee = new Employee();
//        employee.setName("wjl");
//        employee.setSex("female");
//        employee.setAge(24);

        // ��Mapת��ΪJSONArray����
        JSONArray ja1 = JSONArray.fromObject(map1);
        // ��Listת��ΪJSONArray����
        JSONArray ja2 = JSONArray.fromObject(list);
        // ��Beanת��ΪJSONArray����
        //JSONArray ja3 = JSONArray.fromObject(employee);

        System.out.println("JSONArray�������ݸ�ʽ��");
        System.out.println(ja1.toString());
        System.out.println(ja2.toString());
       // System.out.println(ja3.toString());

        // ����Json���ݣ�����һ��map��һ��Employee����
        jo.put("map", ja1);
        jo.put("employee", ja2);
        System.out.println("\n���չ����JSON���ݸ�ʽ��");
        System.out.println(jo.toString());
        JSONArray jsonArray = JSONArray.fromObject(ja2.toString());
        int size = jsonArray.size();
        System.out.println("Size: " + size);
        for(int i=0;i<size;i++){
        	JSONObject jsonObject = jsonArray.getJSONObject(i);
        	System.out.println("[" + i + "]title=" + jsonObject.get("sex"));
        	System.out.println("[" + i + "]author=" + jsonObject.get("name"));
        	System.out.println("[" + i + "]id=" + jsonObject.get("age"));
        }
     

        return jo.toString();

    }

    /**
     * ����Json����
     * 
     * @param jsonString Json�����ַ���
     */
   

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BuildJson();
    }

}