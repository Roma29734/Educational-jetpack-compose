package com.example.testcompot.Example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.layoutId

class ConstrainSimpleExample: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
    @Composable
    fun MainScreen() {
        val constraints = ConstraintSet {
            val upBarBox = createRefFor("upBarBox")
            val firstButtonBox = createRefFor("firstButtonBox")
            val secondButtonBox = createRefFor("secondButtonBox")

            constrain(upBarBox) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.value(50.dp)
            }

            constrain(firstButtonBox) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
            constrain(secondButtonBox) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(firstButtonBox.end)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
            createHorizontalChain(firstButtonBox, secondButtonBox)
        }
        ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .layoutId("upBarBox")
            )
            Button(
                modifier = Modifier
                    .layoutId("firstButtonBox"),
                onClick = { },
            ) {

            }

            Button(
                modifier = Modifier
                    .layoutId("secondButtonBox"),
                onClick = { }
            ) {

            }
        }
    }
}