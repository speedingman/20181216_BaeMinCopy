package kr.tjeit.a20181216_baemincopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japanesFoodBtn;
    private LinearLayout chickenBtn;
    private LinearLayout pizzaBtn;
    private LinearLayout chineseBtn;
    private LinearLayout jokbalBtn;
    private LinearLayout yasicBtn;
    private LinearLayout stewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();

    }


    @Override
    public void setupEvents() {

//        한식 버튼이 눌렸을때 할일.
//        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(mCnext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(mContext, RestaurantListActivity.class);
//                intent.putExtra("음식종류","한식");
//                startActivity(intent);
//
//
//            }
//        });
        
        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "버튼클릭", Toast.LENGTH_SHORT).show();

//                첫번째
//                if(v.getId()==R.id.chickenBtn){
//                    Toast.makeText(mContext, "치킨눌림", Toast.LENGTH_SHORT).show();
//                }else if (v.getId()==R.id.pizzaBtn){
//                    Toast.makeText(mContext, "피자눌림", Toast.LENGTH_SHORT).show();
//                }

//                두번째
//                Toast.makeText(mContext, v.getTag().toString(), Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류",v.getTag().toString());
                startActivity(intent);




            }
        };
        
        

        koreanFoodBtn.setOnClickListener(foodKindClickListener);
        bunsikBtn.setOnClickListener(foodKindClickListener);
        japanesFoodBtn.setOnClickListener(foodKindClickListener);
        chickenBtn.setOnClickListener(foodKindClickListener);
        pizzaBtn.setOnClickListener(foodKindClickListener);
        chineseBtn.setOnClickListener(foodKindClickListener);
        jokbalBtn.setOnClickListener(foodKindClickListener);
        yasicBtn.setOnClickListener(foodKindClickListener);
        stewBtn.setOnClickListener(foodKindClickListener);
        

        

        


//        bunsikBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//        japanesFoodBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

//        사실 읽을 필요가 전혀 없는 코드들.
//        따로 메쏘드를 만들어서 밑으로 치워버리자.
        this.stewBtn = (LinearLayout) findViewById(R.id.stewBtn);
        this.yasicBtn = (LinearLayout) findViewById(R.id.yasicBtn);
        this.jokbalBtn = (LinearLayout) findViewById(R.id.jokbalBtn);
        this.chineseBtn = (LinearLayout) findViewById(R.id.chineseBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.chickenBtn = (LinearLayout) findViewById(R.id.chickenBtn);
        this.japanesFoodBtn = (LinearLayout) findViewById(R.id.japanesFoodBtn);
        this.bunsikBtn = (LinearLayout) findViewById(R.id.bunsikBtn);
        this.koreanFoodBtn = (LinearLayout) findViewById(R.id.koreanFoodBtn);
    }
}








