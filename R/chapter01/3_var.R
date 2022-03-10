#--변수--

var1<-1#var1변수 생성후 1로 초기화
var1

#--변수,멤버선언

var2.age<-20
var2.gender<-'male'
var2.age

#--스칼라변수(하나의 값만 가짐)
var3_1<-35
var3_2<-"홍길동"

#--벡터변수(여러값)
var4<-c("홍길동","이순신","유관순")

#sum(10,22,3)#값 합계연산
#sum(10,20,30,NA)#결측치 자료형
#sum(10,20,20,NA,na.rm=TRUE)#결측치 제거후 합계여산
#ls()#현재 사용중인 변수(객체(보기))

#--자료형 확인

#is.character("")#string 여부 확인
#is.numeric("")#int 여부 확인
#is.logical("")#boolean변수,논리형 여부 확인
#is.na("")#na 여부 확인

#--자료형 변환
#as.numeric()#수치형 변환
#as.logical()#논리형 변환
#as.character()#문자형 변환
#as.data.frame()#데이터프레임 변환
#as.list()#리스트형 변환
#as.array()#다차원형배열 변환
#as.integer()#정수형 변환
#as.double()#실수형 변환
#as.complex()#복소수형 변환
#as.factor()#요인형 변환
#as.vector()#벡터형 변환
#as.Data()#날짜형 변환

#x<-c(1,2,"3") #3개를 가지는 벡터(배열)생성
#result<-x*3#에러발생
#result<-as.numberic(x)#벡터x를 숫자로 변환
#result<-as.integer(x)# 위와 같은 결과
