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
### 2019.02.11 Day09 - Day10
  > 3) RelativeLayout
  
     * 다른 View와의 상대적 위치를 이용
     
     * layout_below (어떤 view 밑에 위치하는가) & layout_above (어떤 view 위에 위치하는가)
     
  > 4) TableLayout
  
     * <TableRow> 태그 = Table의 한 행을 만들어낸다.
     
     * * ScrollView = 다른 뷰를 감싸주기만 해도 view의 크기가 넘어갔을 때 자동으로 생성
     
***
### 2019.02.12 Day11 - Day13
  > 5) FrameLayout
  
     * 중첩 Layout = 가시성 속성을 포함하고 있기 때문
     
     * image 추가 = res -> drawable 밑에 추가
     
     * imageView => Visible & Invisible
     
  * Widget (위젯)
  
    > textview & editText (hint 속성 - 설명 기능)
    
  * Application
  
    > xml file & java file = 두 개의 file로 하나의 화면을 구성 (하나의 Activity)
    
    > #### Inflation
    
       * xml file의 code를 실제화 해주는 것 (화면에 표현)
       
       * setContentView(R.layout.activity_main); => 메모리 상에 객체화 하는 역할 (필수 과정)
       
       * 화면 추가 방법 : xml 화면을 구성 -> inflater로 구체화 -> 부분화면 띄우기
***
### 2019.02.13 Day14
 > 화면 구성 & 화면 간 전환
   * 화면 구성 요소 - 액티비티, 서비스, 브로드 캐스트 수신자 (SMS문자 등을 받을 수 있게), 내용 제공자
   
   * Activity를 직접 file 추가 -> manifest.xml에 <activity> 추가 해야한다.
 
 > 화면 전환 시스템 = Intent를 사용
***
### 2019.02.14 Day15
  > Intent
  
    * 명시적 & 암시적 Intent
    
  > 액티비티를 위한 플래그와 부가 데이터
  
    * Activity = stack 구조를 가지고 있다
    
    * flag를 Intent의 parameter로 지정하여 stack구조의 비효율성을 줄인다.
    
    * flag = Single_top, Clear_top, etc.
    
  > 부가 데이터 전달
  
    * putExtra & get...Extra (get은 자료의 형태가 필요하다)
    
    * Parcelable = 객체 자체를 전달하고자 할 때 사용
***
### 2019.02.16 Day16 - Day17
  > 액티비티 수명주기 -> stack 속 실행 & 일시중지 & 중지
  
  > callback 메소드를 통해 액티비티 상태 전송
  
     * new Activity -> onCreate() 재정의
     
     * onStop, onStart, onResume, onPause, onDestroy
     
   > 서비스 - 화면이 없는 상태에서 백그라운드로 실행 ( onCreate() 호출 )
   
   > 브로드캐스트 수신자 - 일반 & 순서 브로드캐스트 (SMS문자를 받아서 처리하는 작업, etc.)
   
   > 위험 권한 부여 - 위치, 카메라, 마이크, 전화, 문자 등등
***
### 2019.02.17 Day18
  > UI = Widget & View (메뉴, 액션바, 프래그먼트, 웹, etc.) -> Event 처리
  
  > Event 처리 - TouchEvent, KeyEvent, 제스처, 포커스, 화면 방향 등
  
  > #### 단말 방향 전환
  
     * 1) Layout & Layout-land
     
       > 단말 방향 전환 시 데이터 처리 필요
       
     * 2) onConfigurationChanged() 메소드
     
       > 메소드 내의 flag를 통해 제어
***
