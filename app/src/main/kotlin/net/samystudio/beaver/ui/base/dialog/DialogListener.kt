package net.samystudio.beaver.ui.base.dialog

/**
 * Dialog listener for Dialog events, only activities and fragments will received these events if
 * they implement this interface, there is no point to implement it with any other object.
 */
interface DialogListener
{
    /**
     * @see android.content.DialogInterface.OnShowListener.onShow
     */
    fun onDialogShow(requestCode: Int)
    {
    }

    /**
     * @see android.content.DialogInterface.OnCancelListener.onCancel
     */
    fun onDialogCancel(requestCode: Int)
    {
    }

    /**
     * @see android.content.DialogInterface.OnDismissListener.onDismiss
     */
    fun onDialogDismiss(requestCode: Int)
    {
    }
}