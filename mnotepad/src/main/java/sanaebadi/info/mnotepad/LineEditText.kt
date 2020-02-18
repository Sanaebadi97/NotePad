package sanaebadi.info.mnotepad

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatEditText


class LineEditText(context: Context?, attrs: AttributeSet?) : AppCompatEditText(context, attrs) {

    private var mRect: Rect = Rect()
    private var mPaint: Paint = Paint()

    private var mWidth: Float? = null
    private var mColor: Int? = null

    private var array: TypedArray =
        context!!.obtainStyledAttributes(attrs, R.styleable.LineEditText)

    override fun onDraw(canvas: Canvas?) {
        val height = (parent as View).height
        val lineHeight = lineHeight
        val numberOfLines = height / lineHeight

        val rect: Rect = mRect
        val paint: Paint = mPaint

        mPaint.style = Paint.Style.FILL
//        mPaint.strokeWidth = 2.0f
//        mPaint.color = Color.BLACK

        when (id) {
            0 -> Paint.Style.FILL
            1 -> Paint.Style.STROKE
            2 -> Paint.Style.FILL_AND_STROKE
        }

     //   mPaint.style = array.getInt(R.styleable.LineEditText_lineStyle,0)
        mPaint.strokeWidth = array.getFloat(R.styleable.LineEditText_strokeWidth, 2.0f)
        mPaint.color = array.getInt(R.styleable.LineEditText_lineColor, Color.BLACK)


        var baseLine = getLineBounds(0, rect)
        for (i in 0..numberOfLines) {

            canvas!!.drawLine(
                rect.left.toFloat(),
                (baseLine + 1).toFloat(), rect.right.toFloat(), (baseLine + 1).toFloat(), paint
            )
            baseLine += lineHeight
        }

        super.onDraw(canvas)
    }

    fun setStrok(width: Float) {
        mWidth = width
        requestLayout()
    }

    fun setColor(color: Int) {
        mColor = color
        requestLayout()
    }
}