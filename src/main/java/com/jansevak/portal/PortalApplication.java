package com.jansevak.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

    @Bean
    CommandLineRunner loadSchemes(SchemeRepository schemeRepository) {
        return args -> {

            // Student Scholarship
            Scheme s1 = new Scheme();
            s1.setSchemeName("Student Scholarship");
            s1.setMinAge(18);
            s1.setMaxIncome(300000);
            s1.setStudentRequired("yes");
            s1.setCategory("student");
            s1.setState("mp");
            schemeRepository.save(s1);

            // Girls Education Grant
            Scheme s2 = new Scheme();
            s2.setSchemeName("Girls Education Grant");
            s2.setMinAge(18);
            s2.setMaxIncome(400000);
            s2.setStudentRequired("yes");
            s2.setCategory("girl");
            s2.setState("mp");
            schemeRepository.save(s2);

            // Farmer Support Scheme
            Scheme s3 = new Scheme();
            s3.setSchemeName("Farmer Support Scheme");
            s3.setMinAge(21);
            s3.setMaxIncome(500000);
            s3.setStudentRequired("no");
            s3.setCategory("farmer");
            s3.setState("mp");
            schemeRepository.save(s3);

            // Senior Citizen Pension
            Scheme s4 = new Scheme();
            s4.setSchemeName("Senior Citizen Pension");
            s4.setMinAge(60);
            s4.setMaxIncome(300000);
            s4.setStudentRequired("no");
            s4.setCategory("senior");
            s4.setState("mp");
            schemeRepository.save(s4);

            // Unemployment Allowance
            Scheme s5 = new Scheme();
            s5.setSchemeName("Unemployment Allowance");
            s5.setMinAge(18);
            s5.setMaxIncome(200000);
            s5.setStudentRequired("no");
            s5.setCategory("unemployed");
            s5.setState("mp");
            schemeRepository.save(s5);

            // OBC Scholarship
            Scheme s6 = new Scheme();
            s6.setSchemeName("OBC Scholarship");
            s6.setMinAge(18);
            s6.setMaxIncome(350000);
            s6.setStudentRequired("yes");
            s6.setCategory("obc");
            s6.setState("madhya pradesh");
            schemeRepository.save(s6);

            // SC/ST Scholarship
            Scheme s7 = new Scheme();
            s7.setSchemeName("SC/ST Scholarship");
            s7.setMinAge(18);
            s7.setMaxIncome(500000);
            s7.setStudentRequired("yes");
            s7.setCategory("scst");
            s7.setState("mp");
            schemeRepository.save(s7);

            // Startup Youth Grant
            Scheme s8 = new Scheme();
            s8.setSchemeName("Startup Youth Grant");
            s8.setMinAge(21);
            s8.setMaxIncome(600000);
            s8.setStudentRequired("no");
            s8.setCategory("youth");
            s8.setState("mp");
            schemeRepository.save(s8);

            // Rural Housing Scheme
            Scheme s9 = new Scheme();
            s9.setSchemeName("Rural Housing Scheme");
            s9.setMinAge(18);
            s9.setMaxIncome(250000);
            s9.setStudentRequired("no");
            s9.setCategory("general");
            s9.setState("mp");
            schemeRepository.save(s9);

            // Women Self Help Grant
            Scheme s10 = new Scheme();
            s10.setSchemeName("Women Self Help Grant");
            s10.setMinAge(18);
            s10.setMaxIncome(300000);
            s10.setStudentRequired("no");
            s10.setCategory("women");
            s10.setState("mp");
            schemeRepository.save(s10);

            // Agriculture Subsidy Scheme
Scheme s11 = new Scheme();
s11.setSchemeName("Agriculture Subsidy Scheme");
s11.setMinAge(21);
s11.setMaxIncome(400000);
s11.setStudentRequired("no");
s11.setCategory("farmer");
s11.setState("mp");
schemeRepository.save(s11);

// Skill Development Scheme
Scheme s12 = new Scheme();
s12.setSchemeName("Skill Development Scheme");
s12.setMinAge(18);
s12.setMaxIncome(300000);
s12.setStudentRequired("no");
s12.setCategory("youth");
s12.setState("mp");
schemeRepository.save(s12);

// Free Laptop Scheme
Scheme s13 = new Scheme();
s13.setSchemeName("Free Laptop Scheme");
s13.setMinAge(18);
s13.setMaxIncome(250000);
s13.setStudentRequired("yes");
s13.setCategory("student");
s13.setState("mp");
schemeRepository.save(s13);

// Widow Pension Scheme
Scheme s14 = new Scheme();
s14.setSchemeName("Widow Pension Scheme");
s14.setMinAge(40);
s14.setMaxIncome(200000);
s14.setStudentRequired("no");
s14.setCategory("women");
s14.setState("mp");
schemeRepository.save(s14);

// Rural Employment Scheme
Scheme s15 = new Scheme();
s15.setSchemeName("Rural Employment Scheme");
s15.setMinAge(18);
s15.setMaxIncome(300000);
s15.setStudentRequired("no");
s15.setCategory("general");
s15.setState("mp");
schemeRepository.save(s15);

// Health Support Scheme
Scheme s16 = new Scheme();
s16.setSchemeName("Health Support Scheme");
s16.setMinAge(18);
s16.setMaxIncome(400000);
s16.setStudentRequired("no");
s16.setCategory("general");
s16.setState("mp");
schemeRepository.save(s16);

// Farmer Insurance Scheme
Scheme s17 = new Scheme();
s17.setSchemeName("Farmer Insurance Scheme");
s17.setMinAge(21);
s17.setMaxIncome(500000);
s17.setStudentRequired("no");
s17.setCategory("farmer");
s17.setState("mp");
schemeRepository.save(s17);

// Girl Child Protection Scheme
Scheme s18 = new Scheme();
s18.setSchemeName("Girl Child Protection Scheme");
s18.setMinAge(18);
s18.setMaxIncome(300000);
s18.setStudentRequired("no");
s18.setCategory("girl");
s18.setState("mp");
schemeRepository.save(s18);

// Senior Health Scheme
Scheme s19 = new Scheme();
s19.setSchemeName("Senior Health Scheme");
s19.setMinAge(60);
s19.setMaxIncome(300000);
s19.setStudentRequired("no");
s19.setCategory("senior");
s19.setState("mp");
schemeRepository.save(s19);

// Youth Entrepreneurship Scheme
Scheme s20 = new Scheme();
s20.setSchemeName("Youth Entrepreneurship Scheme");
s20.setMinAge(21);
s20.setMaxIncome(600000);
s20.setStudentRequired("no");
s20.setCategory("youth");
s20.setState("mp");
schemeRepository.save(s20);

// National Merit Scholarship
Scheme s21 = new Scheme();
s21.setSchemeName("National Merit Scholarship");
s21.setMinAge(18);
s21.setMaxIncome(300000);
s21.setStudentRequired("yes");
s21.setCategory("scholarship");
s21.setState("mp");
schemeRepository.save(s21);

// Post Matric Scholarship
Scheme s22 = new Scheme();
s22.setSchemeName("Post Matric Scholarship");
s22.setMinAge(18);
s22.setMaxIncome(250000);
s22.setStudentRequired("yes");
s22.setCategory("scholarship");
s22.setState("mp");
schemeRepository.save(s22);

// Minority Scholarship
Scheme s23 = new Scheme();
s23.setSchemeName("Minority Scholarship");
s23.setMinAge(18);
s23.setMaxIncome(300000);
s23.setStudentRequired("yes");
s23.setCategory("scholarship");
s23.setState("mp");
schemeRepository.save(s23);

// Girls Education Scholarship
Scheme s24 = new Scheme();
s24.setSchemeName("Girls Education Scholarship");
s24.setMinAge(18);
s24.setMaxIncome(400000);
s24.setStudentRequired("yes");
s24.setCategory("scholarship");
s24.setState("mp");
schemeRepository.save(s24);

// Central Sector Scholarship
Scheme s25 = new Scheme();
s25.setSchemeName("Central Sector Scholarship");
s25.setMinAge(18);
s25.setMaxIncome(500000);
s25.setStudentRequired("yes");
s25.setCategory("scholarship");
s25.setState("mp");
schemeRepository.save(s25);

// Merit Cum Means Scholarship
Scheme s26 = new Scheme();
s26.setSchemeName("Merit Cum Means Scholarship");
s26.setMinAge(18);
s26.setMaxIncome(300000);
s26.setStudentRequired("yes");
s26.setCategory("scholarship");
s26.setState("mp");
schemeRepository.save(s26);

// AICTE Pragati Scholarship
Scheme s27 = new Scheme();
s27.setSchemeName("AICTE Pragati Scholarship");
s27.setMinAge(18);
s27.setMaxIncome(800000);
s27.setStudentRequired("yes");
s27.setCategory("scholarship");
s27.setState("mp");
schemeRepository.save(s27);

// AICTE Saksham Scholarship
Scheme s28 = new Scheme();
s28.setSchemeName("AICTE Saksham Scholarship");
s28.setMinAge(18);
s28.setMaxIncome(800000);
s28.setStudentRequired("yes");
s28.setCategory("scholarship");
s28.setState("mp");
schemeRepository.save(s28);

// INSPIRE Scholarship
Scheme s29 = new Scheme();
s29.setSchemeName("INSPIRE Scholarship");
s29.setMinAge(18);
s29.setMaxIncome(500000);
s29.setStudentRequired("yes");
s29.setCategory("scholarship");
s29.setState("mp");
schemeRepository.save(s29);

// State Merit Scholarship
Scheme s30 = new Scheme();
s30.setSchemeName("State Merit Scholarship");
s30.setMinAge(18);
s30.setMaxIncome(300000);
s30.setStudentRequired("yes");
s30.setCategory("scholarship");
s30.setState("mp");
schemeRepository.save(s30);

// MP Student Scholarship
Scheme s31 = new Scheme();
s31.setSchemeName("MP Student Scholarship");
s31.setMinAge(18);
s31.setMaxIncome(250000);
s31.setStudentRequired("yes");
s31.setCategory("scholarship");
s31.setState("mp");
schemeRepository.save(s31);

// Engineering Scholarship
Scheme s32 = new Scheme();
s32.setSchemeName("Engineering Scholarship");
s32.setMinAge(18);
s32.setMaxIncome(400000);
s32.setStudentRequired("yes");
s32.setCategory("scholarship");
s32.setState("mp");
schemeRepository.save(s32);

// Medical Scholarship
Scheme s33 = new Scheme();
s33.setSchemeName("Medical Scholarship");
s33.setMinAge(18);
s33.setMaxIncome(400000);
s33.setStudentRequired("yes");
s33.setCategory("scholarship");
s33.setState("mp");
schemeRepository.save(s33);

// Research Fellowship
Scheme s34 = new Scheme();
s34.setSchemeName("Research Fellowship");
s34.setMinAge(21);
s34.setMaxIncome(600000);
s34.setStudentRequired("yes");
s34.setCategory("scholarship");
s34.setState("mp");
schemeRepository.save(s34);

// Digital India Scholarship
Scheme s35 = new Scheme();
s35.setSchemeName("Digital India Scholarship");
s35.setMinAge(18);
s35.setMaxIncome(350000);
s35.setStudentRequired("yes");
s35.setCategory("scholarship");
s35.setState("mp");
schemeRepository.save(s35);

// Skill India Scholarship
Scheme s36 = new Scheme();
s36.setSchemeName("Skill India Scholarship");
s36.setMinAge(18);
s36.setMaxIncome(300000);
s36.setStudentRequired("yes");
s36.setCategory("scholarship");
s36.setState("mp");
schemeRepository.save(s36);

// Rural Talent Scholarship
Scheme s37 = new Scheme();
s37.setSchemeName("Rural Talent Scholarship");
s37.setMinAge(18);
s37.setMaxIncome(250000);
s37.setStudentRequired("yes");
s37.setCategory("scholarship");
s37.setState("mp");
schemeRepository.save(s37);

// Women STEM Scholarship
Scheme s38 = new Scheme();
s38.setSchemeName("Women STEM Scholarship");
s38.setMinAge(18);
s38.setMaxIncome(500000);
s38.setStudentRequired("yes");
s38.setCategory("scholarship");
s38.setState("mp");
schemeRepository.save(s38);

// Future Leaders Scholarship
Scheme s39 = new Scheme();
s39.setSchemeName("Future Leaders Scholarship");
s39.setMinAge(18);
s39.setMaxIncome(400000);
s39.setStudentRequired("yes");
s39.setCategory("scholarship");
s39.setState("mp");
schemeRepository.save(s39);

// Excellence Scholarship
Scheme s40 = new Scheme();
s40.setSchemeName("Excellence Scholarship");
s40.setMinAge(18);
s40.setMaxIncome(300000);
s40.setStudentRequired("yes");
s40.setCategory("scholarship");
s40.setState("mp");
schemeRepository.save(s40);

// Agriculture Schemes

Scheme a1 = new Scheme();
a1.setSchemeName("PM Kisan Samman Nidhi");
a1.setMinAge(18);
a1.setMaxIncome(600000);
a1.setStudentRequired("no");
a1.setCategory("farmer");
a1.setState("mp");
schemeRepository.save(a1);

Scheme a2 = new Scheme();
a2.setSchemeName("Pradhan Mantri Fasal Bima Yojana");
a2.setMinAge(18);
a2.setMaxIncome(600000);
a2.setStudentRequired("no");
a2.setCategory("farmer");
a2.setState("mp");
schemeRepository.save(a2);

Scheme a3 = new Scheme();
a3.setSchemeName("Soil Health Card Scheme");
a3.setMinAge(18);
a3.setMaxIncome(500000);
a3.setStudentRequired("no");
a3.setCategory("farmer");
a3.setState("mp");
schemeRepository.save(a3);

Scheme a4 = new Scheme();
a4.setSchemeName("Kisan Credit Card Scheme");
a4.setMinAge(18);
a4.setMaxIncome(600000);
a4.setStudentRequired("no");
a4.setCategory("farmer");
a4.setState("mp");
schemeRepository.save(a4);

Scheme a5 = new Scheme();
a5.setSchemeName("National Agriculture Market Scheme");
a5.setMinAge(18);
a5.setMaxIncome(500000);
a5.setStudentRequired("no");
a5.setCategory("farmer");
a5.setState("mp");
schemeRepository.save(a5);

Scheme a6 = new Scheme();
a6.setSchemeName("Paramparagat Krishi Vikas Yojana");
a6.setMinAge(18);
a6.setMaxIncome(400000);
a6.setStudentRequired("no");
a6.setCategory("farmer");
a6.setState("mp");
schemeRepository.save(a6);

Scheme a7 = new Scheme();
a7.setSchemeName("Agriculture Infrastructure Fund");
a7.setMinAge(21);
a7.setMaxIncome(600000);
a7.setStudentRequired("no");
a7.setCategory("farmer");
a7.setState("mp");
schemeRepository.save(a7);

Scheme a8 = new Scheme();
a8.setSchemeName("Micro Irrigation Fund Scheme");
a8.setMinAge(18);
a8.setMaxIncome(450000);
a8.setStudentRequired("no");
a8.setCategory("farmer");
a8.setState("mp");
schemeRepository.save(a8);

Scheme a9 = new Scheme();
a9.setSchemeName("Organic Farming Promotion Scheme");
a9.setMinAge(18);
a9.setMaxIncome(350000);
a9.setStudentRequired("no");
a9.setCategory("farmer");
a9.setState("mp");
schemeRepository.save(a9);

Scheme a10 = new Scheme();
a10.setSchemeName("Farm Mechanization Subsidy");
a10.setMinAge(18);
a10.setMaxIncome(500000);
a10.setStudentRequired("no");
a10.setCategory("farmer");
a10.setState("mp");
schemeRepository.save(a10);

Scheme a11 = new Scheme();
a11.setSchemeName("National Food Security Mission");
a11.setMinAge(18);
a11.setMaxIncome(450000);
a11.setStudentRequired("no");
a11.setCategory("farmer");
a11.setState("mp");
schemeRepository.save(a11);

Scheme a12 = new Scheme();
a12.setSchemeName("Integrated Farming Scheme");
a12.setMinAge(18);
a12.setMaxIncome(500000);
a12.setStudentRequired("no");
a12.setCategory("farmer");
a12.setState("mp");
schemeRepository.save(a12);

Scheme a13 = new Scheme();
a13.setSchemeName("Agri Export Promotion Scheme");
a13.setMinAge(21);
a13.setMaxIncome(600000);
a13.setStudentRequired("no");
a13.setCategory("farmer");
a13.setState("mp");
schemeRepository.save(a13);

Scheme a14 = new Scheme();
a14.setSchemeName("Horticulture Development Scheme");
a14.setMinAge(18);
a14.setMaxIncome(400000);
a14.setStudentRequired("no");
a14.setCategory("farmer");
a14.setState("mp");
schemeRepository.save(a14);

Scheme a15 = new Scheme();
a15.setSchemeName("Agri Startup Support Scheme");
a15.setMinAge(21);
a15.setMaxIncome(600000);
a15.setStudentRequired("no");
a15.setCategory("farmer");
a15.setState("mp");
schemeRepository.save(a15);

Scheme a16 = new Scheme();
a16.setSchemeName("Dairy Development Scheme");
a16.setMinAge(18);
a16.setMaxIncome(450000);
a16.setStudentRequired("no");
a16.setCategory("farmer");
a16.setState("mp");
schemeRepository.save(a16);

Scheme a17 = new Scheme();
a17.setSchemeName("Poultry Farming Subsidy");
a17.setMinAge(18);
a17.setMaxIncome(400000);
a17.setStudentRequired("no");
a17.setCategory("farmer");
a17.setState("mp");
schemeRepository.save(a17);

Scheme a18 = new Scheme();
a18.setSchemeName("Fishery Development Scheme");
a18.setMinAge(18);
a18.setMaxIncome(500000);
a18.setStudentRequired("no");
a18.setCategory("farmer");
a18.setState("mp");
schemeRepository.save(a18);

Scheme a19 = new Scheme();
a19.setSchemeName("Farm Storage Infrastructure Scheme");
a19.setMinAge(18);
a19.setMaxIncome(450000);
a19.setStudentRequired("no");
a19.setCategory("farmer");
a19.setState("mp");
schemeRepository.save(a19);

Scheme a20 = new Scheme();
a20.setSchemeName("Agriculture Equipment Loan Scheme");
a20.setMinAge(18);
a20.setMaxIncome(500000);
a20.setStudentRequired("no");
a20.setCategory("farmer");
a20.setState("mp");
schemeRepository.save(a20);


// Widow Pension Scheme
Scheme w1 = new Scheme();
w1.setSchemeName("Widow Pension Scheme");
w1.setMinAge(40);
w1.setMaxIncome(200000);
w1.setStudentRequired("no");
w1.setCategory("women");
w1.setState("mp");
schemeRepository.save(w1);

// Women Skill Development Scheme
Scheme w2 = new Scheme();
w2.setSchemeName("Women Skill Development Scheme");
w2.setMinAge(18);
w2.setMaxIncome(300000);
w2.setStudentRequired("no");
w2.setCategory("women");
w2.setState("mp");
schemeRepository.save(w2);

// Women Entrepreneurship Scheme
Scheme w3 = new Scheme();
w3.setSchemeName("Women Entrepreneurship Scheme");
w3.setMinAge(21);
w3.setMaxIncome(400000);
w3.setStudentRequired("no");
w3.setCategory("women");
w3.setState("mp");
schemeRepository.save(w3);

// Girl Child Protection Scheme
Scheme w4 = new Scheme();
w4.setSchemeName("Girl Child Protection Scheme");
w4.setMinAge(18);
w4.setMaxIncome(300000);
w4.setStudentRequired("no");
w4.setCategory("women");
w4.setState("mp");
schemeRepository.save(w4);

// Women Health Support Scheme
Scheme w5 = new Scheme();
w5.setSchemeName("Women Health Support Scheme");
w5.setMinAge(18);
w5.setMaxIncome(350000);
w5.setStudentRequired("no");
w5.setCategory("women");
w5.setState("mp");
schemeRepository.save(w5);

// Women Education Grant
Scheme w6 = new Scheme();
w6.setSchemeName("Women Education Grant");
w6.setMinAge(18);
w6.setMaxIncome(300000);
w6.setStudentRequired("yes");
w6.setCategory("women");
w6.setState("mp");
schemeRepository.save(w6);

// Women Startup Support
Scheme w7 = new Scheme();
w7.setSchemeName("Women Startup Support");
w7.setMinAge(21);
w7.setMaxIncome(500000);
w7.setStudentRequired("no");
w7.setCategory("women");
w7.setState("mp");
schemeRepository.save(w7);

// Working Women Hostel Scheme
Scheme w8 = new Scheme();
w8.setSchemeName("Working Women Hostel Scheme");
w8.setMinAge(18);
w8.setMaxIncome(300000);
w8.setStudentRequired("no");
w8.setCategory("women");
w8.setState("mp");
schemeRepository.save(w8);

// Women Digital Literacy Scheme
Scheme w9 = new Scheme();
w9.setSchemeName("Women Digital Literacy Scheme");
w9.setMinAge(18);
w9.setMaxIncome(300000);
w9.setStudentRequired("no");
w9.setCategory("women");
w9.setState("mp");
schemeRepository.save(w9);

// Women Financial Assistance Scheme
Scheme w10 = new Scheme();
w10.setSchemeName("Women Financial Assistance Scheme");
w10.setMinAge(18);
w10.setMaxIncome(300000);
w10.setStudentRequired("no");
w10.setCategory("women");
w10.setState("mp");
schemeRepository.save(w10);

// Student Scholarships

Scheme st1 = new Scheme();
st1.setSchemeName("National Merit Scholarship");
st1.setMinAge(18);
st1.setMaxIncome(300000);
st1.setStudentRequired("yes");
st1.setCategory("student");
st1.setState("mp");
schemeRepository.save(st1);

Scheme st2 = new Scheme();
st2.setSchemeName("Post Matric Scholarship");
st2.setMinAge(18);
st2.setMaxIncome(250000);
st2.setStudentRequired("yes");
st2.setCategory("student");
st2.setState("mp");
schemeRepository.save(st2);

Scheme st3 = new Scheme();
st3.setSchemeName("OBC Student Scholarship");
st3.setMinAge(18);
st3.setMaxIncome(350000);
st3.setStudentRequired("yes");
st3.setCategory("student");
st3.setState("mp");
schemeRepository.save(st3);

Scheme st4 = new Scheme();
st4.setSchemeName("SC/ST Student Scholarship");
st4.setMinAge(18);
st4.setMaxIncome(500000);
st4.setStudentRequired("yes");
st4.setCategory("student");
st4.setState("mp");
schemeRepository.save(st4);

Scheme st5 = new Scheme();
st5.setSchemeName("Minority Student Scholarship");
st5.setMinAge(18);
st5.setMaxIncome(300000);
st5.setStudentRequired("yes");
st5.setCategory("student");
st5.setState("mp");
schemeRepository.save(st5);

Scheme st6 = new Scheme();
st6.setSchemeName("Girls Education Scholarship");
st6.setMinAge(18);
st6.setMaxIncome(400000);
st6.setStudentRequired("yes");
st6.setCategory("student");
st6.setState("mp");
schemeRepository.save(st6);

Scheme st7 = new Scheme();
st7.setSchemeName("AICTE Pragati Scholarship");
st7.setMinAge(18);
st7.setMaxIncome(800000);
st7.setStudentRequired("yes");
st7.setCategory("student");
st7.setState("mp");
schemeRepository.save(st7);

Scheme st8 = new Scheme();
st8.setSchemeName("AICTE Saksham Scholarship");
st8.setMinAge(18);
st8.setMaxIncome(800000);
st8.setStudentRequired("yes");
st8.setCategory("student");
st8.setState("mp");
schemeRepository.save(st8);

Scheme st9 = new Scheme();
st9.setSchemeName("Central Sector Scholarship");
st9.setMinAge(18);
st9.setMaxIncome(500000);
st9.setStudentRequired("yes");
st9.setCategory("student");
st9.setState("mp");
schemeRepository.save(st9);

Scheme st10 = new Scheme();
st10.setSchemeName("Merit Cum Means Scholarship");
st10.setMinAge(18);
st10.setMaxIncome(300000);
st10.setStudentRequired("yes");
st10.setCategory("student");
st10.setState("mp");
schemeRepository.save(st10);

Scheme st11 = new Scheme();
st11.setSchemeName("INSPIRE Scholarship");
st11.setMinAge(18);
st11.setMaxIncome(500000);
st11.setStudentRequired("yes");
st11.setCategory("student");
st11.setState("mp");
schemeRepository.save(st11);

Scheme st12 = new Scheme();
st12.setSchemeName("MP Student Scholarship");
st12.setMinAge(18);
st12.setMaxIncome(250000);
st12.setStudentRequired("yes");
st12.setCategory("student");
st12.setState("mp");
schemeRepository.save(st12);

Scheme st13 = new Scheme();
st13.setSchemeName("Engineering Student Scholarship");
st13.setMinAge(18);
st13.setMaxIncome(400000);
st13.setStudentRequired("yes");
st13.setCategory("student");
st13.setState("mp");
schemeRepository.save(st13);

Scheme st14 = new Scheme();
st14.setSchemeName("Medical Student Scholarship");
st14.setMinAge(18);
st14.setMaxIncome(400000);
st14.setStudentRequired("yes");
st14.setCategory("student");
st14.setState("mp");
schemeRepository.save(st14);

Scheme st15 = new Scheme();
st15.setSchemeName("Research Fellowship Scholarship");
st15.setMinAge(21);
st15.setMaxIncome(600000);
st15.setStudentRequired("yes");
st15.setCategory("student");
st15.setState("mp");
schemeRepository.save(st15);

Scheme st16 = new Scheme();
st16.setSchemeName("Digital India Scholarship");
st16.setMinAge(18);
st16.setMaxIncome(350000);
st16.setStudentRequired("yes");
st16.setCategory("student");
st16.setState("mp");
schemeRepository.save(st16);

Scheme st17 = new Scheme();
st17.setSchemeName("Skill India Student Scholarship");
st17.setMinAge(18);
st17.setMaxIncome(300000);
st17.setStudentRequired("yes");
st17.setCategory("student");
st17.setState("mp");
schemeRepository.save(st17);

Scheme st18 = new Scheme();
st18.setSchemeName("Rural Talent Scholarship");
st18.setMinAge(18);
st18.setMaxIncome(250000);
st18.setStudentRequired("yes");
st18.setCategory("student");
st18.setState("mp");
schemeRepository.save(st18);

Scheme st19 = new Scheme();
st19.setSchemeName("Women STEM Scholarship");
st19.setMinAge(18);
st19.setMaxIncome(500000);
st19.setStudentRequired("yes");
st19.setCategory("student");
st19.setState("mp");
schemeRepository.save(st19);

Scheme st20 = new Scheme();
st20.setSchemeName("Future Leaders Scholarship");
st20.setMinAge(18);
st20.setMaxIncome(400000);
st20.setStudentRequired("yes");
st20.setCategory("student");
st20.setState("mp");
schemeRepository.save(st20);

// Pension Schemes (Senior Citizen)

Scheme p1 = new Scheme();
p1.setSchemeName("Indira Gandhi National Old Age Pension Scheme");
p1.setMinAge(60);
p1.setMaxIncome(300000);
p1.setStudentRequired("no");
p1.setCategory("senior");
p1.setState("mp");
schemeRepository.save(p1);

Scheme p2 = new Scheme();
p2.setSchemeName("Senior Citizen Pension Scheme");
p2.setMinAge(60);
p2.setMaxIncome(300000);
p2.setStudentRequired("no");
p2.setCategory("senior");
p2.setState("mp");
schemeRepository.save(p2);

Scheme p3 = new Scheme();
p3.setSchemeName("Widow Pension Scheme");
p3.setMinAge(40);
p3.setMaxIncome(250000);
p3.setStudentRequired("no");
p3.setCategory("senior");
p3.setState("mp");
schemeRepository.save(p3);

Scheme p4 = new Scheme();
p4.setSchemeName("National Pension System");
p4.setMinAge(60);
p4.setMaxIncome(500000);
p4.setStudentRequired("no");
p4.setCategory("senior");
p4.setState("mp");
schemeRepository.save(p4);

Scheme p5 = new Scheme();
p5.setSchemeName("Atal Pension Yojana");
p5.setMinAge(60);
p5.setMaxIncome(500000);
p5.setStudentRequired("no");
p5.setCategory("senior");
p5.setState("mp");
schemeRepository.save(p5);

Scheme p6 = new Scheme();
p6.setSchemeName("State Old Age Pension Scheme");
p6.setMinAge(60);
p6.setMaxIncome(300000);
p6.setStudentRequired("no");
p6.setCategory("senior");
p6.setState("mp");
schemeRepository.save(p6);

Scheme p7 = new Scheme();
p7.setSchemeName("Senior Citizen Health Pension");
p7.setMinAge(60);
p7.setMaxIncome(350000);
p7.setStudentRequired("no");
p7.setCategory("senior");
p7.setState("mp");
schemeRepository.save(p7);

Scheme p8 = new Scheme();
p8.setSchemeName("Disabled Pension Scheme");
p8.setMinAge(18);
p8.setMaxIncome(250000);
p8.setStudentRequired("no");
p8.setCategory("senior");
p8.setState("mp");
schemeRepository.save(p8);

Scheme p9 = new Scheme();
p9.setSchemeName("Senior Citizen Financial Support Scheme");
p9.setMinAge(60);
p9.setMaxIncome(300000);
p9.setStudentRequired("no");
p9.setCategory("senior");
p9.setState("mp");
schemeRepository.save(p9);

Scheme p10 = new Scheme();
p10.setSchemeName("Senior Citizen Welfare Scheme");
p10.setMinAge(60);
p10.setMaxIncome(350000);
p10.setStudentRequired("no");
p10.setCategory("senior");
p10.setState("mp");
schemeRepository.save(p10);
// Employment Support Schemes

Scheme e1 = new Scheme();
e1.setSchemeName("Pradhan Mantri Rozgar Yojana");
e1.setMinAge(18);
e1.setMaxIncome(400000);
e1.setStudentRequired("no");
e1.setCategory("youth");
e1.setState("mp");
schemeRepository.save(e1);

Scheme e2 = new Scheme();
e2.setSchemeName("Skill India Mission");
e2.setMinAge(18);
e2.setMaxIncome(500000);
e2.setStudentRequired("no");
e2.setCategory("youth");
e2.setState("mp");
schemeRepository.save(e2);

Scheme e3 = new Scheme();
e3.setSchemeName("Startup India Scheme");
e3.setMinAge(21);
e3.setMaxIncome(600000);
e3.setStudentRequired("no");
e3.setCategory("youth");
e3.setState("mp");
schemeRepository.save(e3);

Scheme e4 = new Scheme();
e4.setSchemeName("Stand Up India Scheme");
e4.setMinAge(21);
e4.setMaxIncome(600000);
e4.setStudentRequired("no");
e4.setCategory("youth");
e4.setState("mp");
schemeRepository.save(e4);

Scheme e5 = new Scheme();
e5.setSchemeName("National Career Service Scheme");
e5.setMinAge(18);
e5.setMaxIncome(400000);
e5.setStudentRequired("no");
e5.setCategory("youth");
e5.setState("mp");
schemeRepository.save(e5);

Scheme e6 = new Scheme();
e6.setSchemeName("PM Kaushal Vikas Yojana");
e6.setMinAge(18);
e6.setMaxIncome(400000);
e6.setStudentRequired("no");
e6.setCategory("youth");
e6.setState("mp");
schemeRepository.save(e6);

Scheme e7 = new Scheme();
e7.setSchemeName("Digital India Skill Program");
e7.setMinAge(18);
e7.setMaxIncome(400000);
e7.setStudentRequired("no");
e7.setCategory("youth");
e7.setState("mp");
schemeRepository.save(e7);

Scheme e8 = new Scheme();
e8.setSchemeName("Youth Entrepreneurship Scheme");
e8.setMinAge(21);
e8.setMaxIncome(600000);
e8.setStudentRequired("no");
e8.setCategory("youth");
e8.setState("mp");
schemeRepository.save(e8);

Scheme e9 = new Scheme();
e9.setSchemeName("Rural Self Employment Training");
e9.setMinAge(18);
e9.setMaxIncome(300000);
e9.setStudentRequired("no");
e9.setCategory("youth");
e9.setState("mp");
schemeRepository.save(e9);

Scheme e10 = new Scheme();
e10.setSchemeName("Urban Employment Support Scheme");
e10.setMinAge(18);
e10.setMaxIncome(350000);
e10.setStudentRequired("no");
e10.setCategory("youth");
e10.setState("mp");
schemeRepository.save(e10);

// Minority Schemes

Scheme m1 = new Scheme();
m1.setSchemeName("Pre Matric Minority Scholarship");
m1.setMinAge(14);
m1.setMaxIncome(250000);
m1.setStudentRequired("yes");
m1.setCategory("minority");
m1.setState("mp");
schemeRepository.save(m1);

Scheme m2 = new Scheme();
m2.setSchemeName("Post Matric Minority Scholarship");
m2.setMinAge(18);
m2.setMaxIncome(300000);
m2.setStudentRequired("yes");
m2.setCategory("minority");
m2.setState("mp");
schemeRepository.save(m2);

Scheme m3 = new Scheme();
m3.setSchemeName("Merit Cum Means Minority Scholarship");
m3.setMinAge(18);
m3.setMaxIncome(300000);
m3.setStudentRequired("yes");
m3.setCategory("minority");
m3.setState("mp");
schemeRepository.save(m3);

Scheme m4 = new Scheme();
m4.setSchemeName("Nai Roshni Scheme for Minority Women");
m4.setMinAge(18);
m4.setMaxIncome(300000);
m4.setStudentRequired("no");
m4.setCategory("minority");
m4.setState("mp");
schemeRepository.save(m4);

Scheme m5 = new Scheme();
m5.setSchemeName("Nai Manzil Education Scheme");
m5.setMinAge(18);
m5.setMaxIncome(300000);
m5.setStudentRequired("yes");
m5.setCategory("minority");
m5.setState("mp");
schemeRepository.save(m5);

Scheme m6 = new Scheme();
m6.setSchemeName("Nai Udaan Scheme");
m6.setMinAge(18);
m6.setMaxIncome(350000);
m6.setStudentRequired("yes");
m6.setCategory("minority");
m6.setState("mp");
schemeRepository.save(m6);

Scheme m7 = new Scheme();
m7.setSchemeName("Seekho aur Kamao Scheme");
m7.setMinAge(18);
m7.setMaxIncome(350000);
m7.setStudentRequired("no");
m7.setCategory("minority");
m7.setState("mp");
schemeRepository.save(m7);

Scheme m8 = new Scheme();
m8.setSchemeName("USTTAD Scheme for Minority Craftsmen");
m8.setMinAge(18);
m8.setMaxIncome(400000);
m8.setStudentRequired("no");
m8.setCategory("minority");
m8.setState("mp");
schemeRepository.save(m8);

Scheme m9 = new Scheme();
m9.setSchemeName("Hamari Dharohar Scheme");
m9.setMinAge(18);
m9.setMaxIncome(400000);
m9.setStudentRequired("no");
m9.setCategory("minority");
m9.setState("mp");
schemeRepository.save(m9);

Scheme m10 = new Scheme();
m10.setSchemeName("Minority Coaching Support Scheme");
m10.setMinAge(18);
m10.setMaxIncome(300000);
m10.setStudentRequired("yes");
m10.setCategory("minority");
m10.setState("mp");
schemeRepository.save(m10);
        };
    }
}