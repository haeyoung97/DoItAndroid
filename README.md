# Do It Android
## 안드로이드 앱 프로그래밍
> 동영상 강의 및 교재
***
### 2019.02.07 Day01 - Day02
  * Android에 대한 기본적인 개념
  * Android Studio 설치
  * Application 생성 및 실행 (Button 추가)
***
### 2019.02.09 Day03
 * 여러개의 화면 구성 (new Activity 생성)
 * Basic Activity Project 생성 (Hello2) - 스냅바
 * Navigation Drawer Activity Project 생성 (Hello3) - 햄버거 메뉴.
***
### 2019.02.09 Day04 - Day05
 * Android 익히기 - Project 생성
 
 > 화면 = Activity, code editer -> class generate 기능 (코드 자동생성)
 
   xml code를 parsing -> design tab에 표현

 > View 속성
 
    1) view = 화면 안에 들어가는 것 (Button, Text, etc.)
 
    2) view group = 뷰들을 담아놓는 것 (view를 상속)
 
    3) widget = control 역할 (Button, etc.)
 
    4) layout = 뷰를 배치하는 역할 (영역을 나누어 구분)
 
 * XML Layout
 
 > * 시작태그 = view & widget 생성
 
    API안에 포함된 태그 = 기능명만 명시 (TextView, etc.)
 
    외부라이브러리 태그 = 패키지명까지 명시
 
    필수 속성 = width, height -> 단위 = dp (밀도 독립적 픽셀), sp (글꼴 크기)
 
    값 1 = wrap_content = 뷰에 들어있는 내용물 크기에 맞춤
 
    값 2 = match_parent = 뷰 그룹에 남아있는 여유공간 채움
 
    값 3 = 크기 값 고정
 ***
 ### 2019.02.10 Day06 - Day08
  * Layout 종류
  
   1) ConstrainLayout = 제약 조건을 사용하여 화면을 구성 ( IOS의 레이아웃과 비슷)
   
   2) LinearLayout = 한쪽 방향으로 화면을 구성 (가로&세로 중 한 방향으로만 필수로 설정)
   
   3) RelativeLayout = 다른 뷰와의 상대적인 위치를 이용하여 화면을 구성
   
   4) FrameLayout = 중첩하여 쌓이는 화면을 구성
   
   5) TableLayout = 격자 모양의 배열형식으로 화면을 구성 ( ex. 갤러리 )
  
  > 1) ContrainLayout
     
     * View끼리 연결 or View & Line 연결 (위치를 구성) - Bias 존재
     
     * Handle = View의 크기를 결정
     
     * 양방향 연결 = 가운데 정렬
     
     * margin (View의 바깥) & padding (View의 내부)
     
     * 추가 설정 = ex. Background, Textsize, TextColor, etc.
  
  > 2) LinearLayout
     
     * Horizontal & Vertical 설정은 필수 (여유 공간이 있어야 정렬 가능 - Gravity)
***

