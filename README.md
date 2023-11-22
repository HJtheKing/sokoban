# sokoban
## v1
### 클래스 설명
- class **skvData** : 해당 스테이지의 단계, 지도 정보 등의 데이터 보관.
  
### 메서드 설명
- void **toString**(skvData data) : 데이터를 출력 양식에 맞게 반환.
- skvData **createSkvData1**(Scanner sc) : stage1 객체 생성.
- skvData **createSkvData2**(Scanner sc) : stage2 객체 생성.
- void **createLstInt**(skvData data) : skvData 클래스의에 담긴 지도의 정보로 기호를 숫자로 변환.

### 풀이
1. **skvData** 객체를 생성 및 **createLstInt** 메서드를 사용하여 stage1, 2 두 개의 객체를 생성하고 데이터를 보관.
2. **toString** 메서드를 통해 저장된 데이터를 출력 양식에 맞게 출력.

### 실행결과
- 출력예시와 동일하게 각 스테이지별 정보를 출력함.
- **그러나 입력 예시의 코드복사 버튼을 눌러 복사하면 올바른 값을 얻어내지 못해서,<br/>임의로 각 줄의 가로 길이를 동일하게 입력해줘야 함**(예. stage2의 경우 우측에 공백을 입력하여 모두 11칸이 되게)
- stage1, 2를 개별 메서드로 분리하여 만든 부분이 아쉽다고 생각.


## v2
### 클래스 설명
- class **sokobanV2** : 소코반이 동작하는 위치
- class **stage2** : stage2의 정보와 **sokobanV2**의 세부 동작 메서드의 집합.

### 메서드 설명
- int **getIdx**(char[] chars) : 플레이어의 index값 반환.
- void **printMap**() : 지도 출력.
- void **move**(String str) : 사용자 입력을 매개변수로 받아 w/a/s/d에 해당되면 **moveIndividual** 메서드 동작, 그렇지않거나 예외 발생시 경고 메세지 출력.
- void **moveIndividual**(char chr) : 입력값에 따라 moveW/moveA/moveS/moveD 메서드 동작.
- vodi **moveW/moveA/moveS/moveD**(char chr) : Player를 이동시키고 결과 출력, 이동할 수 없을시 경고 메세지 출력.

### 풀이
1. **stage2** 클래스에 String으로 지도 저장, char 배열로 변환하여 플레이어 이동 용이하게 함, **getIdx** 메서드로 현재 플레이어 좌표 구함.
2. sokobanV2 클래스에 stage2 객체 생성.
3. while문 사용하여 입력 값을 받고 소문자로 변경(stage2 메서드에서 사용 원할하게 하기 위함), 'q' 입력시 break.
4. **move** 메서드로 플레이어의 이동 및 경고 메세지, 이동 후 지도 출력.

### 실행결과
- 값을 입력 받고 값이 정상적이라면 플레이어의 위치를 이동시키고 그 결과를 출력.
- 공이나 벽에 부딪힌 경우 / 정상적인 입력 값이 아닌 경우 각각 다른 경고 메세지를 출력.
- 다른 지도가 입력되어도 범용적으로 사용될 수 있게 설계하지 못한 점이 아쉬움.
