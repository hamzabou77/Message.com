window.onload = function() {
    const messageContent = `
مرحبًا! 🎉
أنت الآن في الصفحة الخاصة. هذه رسالة تجريبية تُكتب حرفًا بحرف كما لو كانت تُكتب لأول مرة.

فقط تمهل واستمتع بالقراءة، فيمكنك التمرير لأسفل أو لأعلى حسب رغبتك.

تابع القراءة للحصول على المزيد من المفاجآت! 🎁
    `;
    
    let i = 0;
    const messageDiv = document.getElementById("message");

    // دالة الكتابة التدريجية
    function typeMessage() {
        if (i < messageContent.length) {
            messageDiv.innerHTML += messageContent.charAt(i);
            i++;
            messageDiv.scrollTop = messageDiv.scrollHeight; // التمرير التلقائي
            setTimeout(typeMessage, 50); // تأخير بين كل حرف
        }
    }
    
    typeMessage();
};