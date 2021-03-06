package com.kh.john.exboard.controller;

import java.util.Random;

/**
 * @Author : cms
 * @Date : 2020. 12. 8.
 * @explain : 랜덤 이름 닉네임 생일 생성용으로 만듬, MEMBER INSERT문으로 자동 생성됨 쓸사람 쓰셈 아무도 안쓰겠지만 ㅋㅋ
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 33;
		int count = 100;

		for (int i = start; i < count + start; i++) {
			// System.out.print("랜덤 이름 " + i + " : " + randomName(3));
			// System.out.print(" 랜덤 닉네임 : " + randomNickName());
			// System.out.println(" 랜덤 생일 : " + randomBirthDay());
			System.out.println("INSERT INTO MEMBER VALUES(SEQ_MEMBER_NO.NEXTVAL,'johntest" + i + "@naver.com','0000','"
					+ randomName(3) + "','" + randomNickName() + "','F','" + randomBirthDay()
					+ "',SYSDATE,DEFAULT,DEFAULT,DEFAULT,'전문가',DEFAULT,DEFAULT);");
		}

	}

	private static String randomName(int length) {
		String name = "";
		String[] array = { "김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안", "송",
				"류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
				"우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염",
				"양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반",
				"왕", "금", "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용" };

		String[] array2 = { "가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다", "단",
				"달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
				"백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙",
				"순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "양", "영", "예", "오", "옥", "완", "요", "용", "우",
				"원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제",
				"조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하",
				"한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉",
				"혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언",
				"령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더",
				"손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평",
				"늘", "늬", "랑", "얀", "향", "울", "련" };

		name += array[new Random().nextInt(array.length - 1) + 1];
		for (int i = 1; i < length; i++) {
			name += array2[new Random().nextInt(array2.length - 1) + 1];
		}
		return name;
	}

	private static String randomNickName() {
		String nickname = "";

		String[] array = { "정신없는", "나대는", "불안한", "심심한", "거만한", "신비한", "기분나쁜", "기분좋은", "신바람나는", "상쾌한", "짜릿한", "그리운",
				"자유로운", "서운한", "울적한", "비참한", "위축되는", "긴장되는", "두려운", "당당한", "배부른", "수줍은", "창피한", "멋있는", "열받은", "심심한",
				"잘생긴", "이쁜", "시끄러운", "징그러운", "찌질한", "겁없는", "바보같은", "섹시한", "치명적인", "야한", "귀여운", "멍청한", "기묘한", "덜떨어진",
				"못생긴", "찌글찌글한", "쭈글쭈글한", "숨막히는", "영광스러운", "바쁜척하는", "놀고싶은", "졸린", "빡친" };

		String[] array2 = { "노루", "사슴", "염소", "양", "젖소", "돼지", "오이", "알파카", "낙타", "꼼장어", "쭈꾸미", "드래곤", "작은콩", "킹콩",
				"모기", "꿀벌", "사람", "개구리", "뱀", "올빼미", "부엉이", "오소리", "호박", "개미핥기", "돌고래", "공작새", "독수리", "나무발바리", "나무늘보",
				"코끼리", "문어", "잉어", "오징어", "사자", "코끼리", "호랑이", "곰", "여우", "늑대", "너구리", "침팬치", "고릴라", "참새", "두리안", "고슴도치",
				"강아지", "고양이", "거북이", "토끼", "앵무새", "하이에나", "돼지", "하마", "원숭이", "물소", "얼룩말", "치타", "악어", "기린", "수달", "염소",
				"다람쥐", "판다" };

		nickname += array[new Random().nextInt(array.length - 1) + 1];
		nickname += array2[new Random().nextInt(array2.length - 1) + 1];
		return nickname;
	}

	private static String randomBirthDay() {
		String day = "";
		int year = new Random().nextInt(30) + 1960;
		int m = new Random().nextInt(12) + 1;
		int d = new Random().nextInt(30) + 1;
		day = year + "/" + m + "/" + d;
		return day;
	}

}
