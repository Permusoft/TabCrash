# TabCrash
Android project demonstrating potential NPE in Nougat's `android.support.design.widget.TabLayout`.

Nougat replaced `TabLayout`'s [setOnTabSelectedListener()](https://developer.android.com/reference/android/support/design/widget/TabLayout.html#setOnTabSelectedListener%28android.support.design.widget.TabLayout.OnTabSelectedListener%29) with the more general [addOnTabSelectedListener()](https://developer.android.com/reference/android/support/design/widget/TabLayout.html#addOnTabSelectedListener%28android.support.design.widget.TabLayout.OnTabSelectedListener%29).

The calling code however doesn't seem to check for a null `Tab` object, which occurs when the first is added.
