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
### 2019.02.18 Day19
  > Toast & 대화상자
  
    * > Toast - 간단한 메세지 띄우기
    
      * setGravity() - 위치 바꾸기, LayoutInflater (메모리 객체화) -> 디자인 적용
      
    * > 액션바 & 스냅바 => 사용을 위해서 design 외부 라이브러리 추가
    
    * > 대화상자 - AlertDialog를 사용하여 띄우기
    
  > ProgressBar
  
    * Spinner design (진행상황 알림 시 사용 가능)
    
    * SeekBar design (슬라이더 바와 같은 디자인)
    
  > 간단한 애니메이션
  
    * 애니메이션은 대부분 트윈애니메이션으로 구현
    
    * 애니메이션을 구현하기 위해서 특정 디렉터리 필요 (xml file - <translate> 태그 사용)
***
### 2019.02.20 Day20
  > 페이지 슬라이딩 - 뷰의 중첩 & 애니메이션 적용 (panel)
  
  > Fragment - 부분화면으로 독립적으로 활용될 수 있다.
  
    * 액티비티와 같이 동작 -> 프래그먼트 매니저가 관리 ( 액티비티 안에 존재 )
    
    * 프래그먼트 = xml file & Java file 필요
    
    * 프래그먼트끼리 직접 접근 X
    
      * Activity = intent & Fragment = method
***
### 2019.02.26 Day21 - Day22
  > 액션바 & 탭 사용하기
   
    * 액션바 = title + button + toolbar 등의 기능을 가진다.
     
    * 옵션 메뉴 or 컨텍스트 메뉴
     
    * 사용법 = menu directory 생성 -> xml file 추가 -> 자동생성
     
  > 웹 브라우저 = WebView 태그 사용
   
  > EditText 속성
   
    * hint 속성 = 흐리게 글씨 보이기 (ex. 비밀번호 입력, 아이디 입력, etc.)
    
    * Keypad의 Input type 속성 (ex. number, password, etc.)
***
### 2019.02.26 Day23
  > #### 선택 위젯 & 커스텀뷰
  
  > NinePatch image
  
    * 이미지 왜곡을 해결하는 방법
    
    * ninePatch image가 따로 필요하다 -> 한 pixel이 큰 image = image의 정보 설정을 위한 도구
    
  > Bitmap Button
  
    * OnDraw() => 그래픽 그리기 (재정의 하여 사용한다)
    
    * OnMesure() => 내용물의 크기를 재정의 하여 그리기
    
    * 사용법
    
      > AppCompatButton을 상속하여 Java file 생성
      
      > OnTouchEvent() 함수를 이용하여 변화를 살펴보기
      
      > 이는 invalidate() 함수 ( = 다시그리기 ) 를 이용하여 버튼을 다시 그린다.
  
  > ListView - 여러 개의 Item = 선택 위젯
  
    * 어댑터로 데이터를 관리한다.
    
    * 어댑터로 View를 컨트롤 한다.
***
### 2019.03.10 Day24
  > ListView 적용
  
    * 아이템을 위한 뷰 = xml file + java file
     
    * 어댑터를 정의해야한다 => getView()를 통해 화면에 보여질 ListView의 View를 구성한다.
***
### 2019.03.11 Day25
  > 스피너
  
    * 콤보 박스처럼 선택할 수 있다 (xml 레이아웃에 정의)
    
    * 어댑터를 사용하여 구현
    
  > 그리드 뷰 - 테이블 형태로 보여주는 데이터를 관리할 어댑터 정의 필요
  
  > 복합 위젯 - 여러 개의 위젯 또는 뷰를 포함하여 하나의 위젯을 구현
*** 
### 2019.03.12 Day26
  > 월별 캘린더 만들기
  
    * 두 개의 버튼 이미지와 그리드 뷰를 이용하여 구현
    
    * 어댑터를 정의하여 캘린터 뷰를 구성
    
  > 멀티 터치 
  
    * 두 개의 손가락을 이용하여 사진의 확대/축소하는 동작을 구현
    
    * onTouchEvent(), onDraw(), onStartChanged() 메소드를 통해 구현
***
### 2019.03.13 Day27
  > 그래픽 사용하기
  
    * 캔버스 개체 => 화면에 그려지는 작업 수행
    
  > 주요 클래스
  
    * 캔버스, 페인트, 비트맵, 그리기 객체 등
    
  > 그리기 객체 사용하기
  
    * 리소스 파일의 사용
      ** 프로젝트 리소스에 이미지와 같은 파일을 포함시킨 후 읽어 들여 사용함
    
    * XML로 정의하여 사용
      ** 그리기 객체의 속성을 정의한 XML 파일을 정의하여 사용함
    
    * 자바 코드에서 객체를 만들어 사용
      ** 자바 코드에서 new연산자를 이용하여 그리기 객체를 만든 후 사용함
      ** 비트맵 이미지를 주어진 좌표값에 그림
***
### 2019.03.15 Day28
  > 비트맵 그리기
  
    * 더블 버퍼링 :  그래픽을 다시 그리기 할 때 깜박임 현상 해소
    
    * drawBitmap() : 비트맵 객체에 미리 그린후 객체를 뷰에 그려주는 방식

  > 페인트보드 만들기
    
    * 터치 이벤트를 이용한 새로운 뷰 클래스 정의
    
    * PaintBoard -> GoodPaintBoard -> BestPaintBoard
***
