package com.hanyj96.dadaeyeo.presentation.main;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.hanyj96.dadaeyeo.data.model.HomeItem;
import com.hanyj96.dadaeyeo.data.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {
    private MainRepository mainRepository;
    @Inject
    MainViewModel(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }
    public void InitData(){
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        CollectionReference collectionReference = firebaseFirestore.collection("Products");
        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new Product("60000000","갤럭시워치3",425700);
        Product p2 = new Product("60000001","갤럭시워치 액티브2",223270);
        Product p3 = new Product("60000002","갤럭시 핏2",44550);
        Product p4 = new Product("60000003","롤렉스 밀가우스 오토매틱",21133200);
        Product p5 = new Product("60000004","롤렉스 서브마리너 검콤",21300000);
        Product p6 = new Product("60000005","샤오미 밴드5",34600);
        Product p7 = new Product("60000006","애플워치 SE",359000);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        Product p8 = new Product("10000000","아이폰12Pro",1350000);
        Product p9 = new Product("10000001","iPad Air 10.9 4세대",760360);
        Product p10 = new Product("10000002","iPad Pro 11 2세대",1029000);
        Product p11 = new Product("10000003","소니 PlayStation 4 Pro",550000);
        Product p12 = new Product("10000004","XBOX one X 본체",559800);
        Product p13 = new Product("10000005","갤럭시 S20 SE",839800);
        Product p14 = new Product("10000006","갤럭시 노트20",1163030);
        Product p15 = new Product("10000007","갤럭시 Z 플립 5G",1500000);
        Product p16 = new Product("10000008","LG 그램 15",1248020);
        Product p17 = new Product("10000009","2020년 맥북 프로16",3085260);
        Product p18 = new Product("10000010","닌텐도 스위치",356000);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        products.add(p11);
        products.add(p12);
        products.add(p13);
        products.add(p14);
        products.add(p15);
        products.add(p16);
        products.add(p17);
        products.add(p18);
        Map<String, ArrayList<Product>> map = new HashMap<>();
        map.put("AllProduct", products);
        collectionReference.document("1").set(map);
    }
    public void testData(){
        Product p9 = new Product("10000001","iPad Air 10.9 4세대",760360);
        Product p10 = new Product("10000002","iPad Pro 11 2세대",1029000);
        CollectionReference collectionReference = FirebaseFirestore.getInstance().collection("ProductList");
        DocumentReference doc = collectionReference.document("ElectronicProducts");
        doc.collection("Tablet").add(p9);
        doc.collection("Tablet").add(p10);
    }
}
