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
