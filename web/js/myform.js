function validateForm() {
    var email = document.getElementById("emailAddress").value;
    var password = document.getElementById("passWord").value;
    var validPass = 123456;
    if (email.match(/^[a-z0-9_]+\@[a-z]+\.[a-z]{2,3}$/) && password == validPass) {
        window.location = "secpage.html";
    } else if (password != validPass) {
        bootbox.confirm({
            title: "Access Denied",
            message: "Password Doesnt Matches",
            callback: function () {
                /* your callback code */ }
        })
    } else {
        bootbox.confirm({
            title: "Access Denied",
            message: "Admin Email Doesnt Matches",
            callback: function () {
                /* your callback code */ }
        })
    }
}

////////////////////////////////////////
function validateSignForm(){
    var names = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("passw").value;
    var contact = document.getElementById("contact").value;

    var gender = document.getElementsByName("gen");
    var skills = document.getElementsByName("skill");

    var doba = document.getElementById("dob1");
    var dobb = document.getElementById("dob2");
    var dobc = document.getElementById("dob3");
    
if (names!="" && password!="" && (email.match(/^[a-z0-9A-Z]+\@[a-z]+\.[a-z]{2,3}$/)) && date1(doba) && date2(dobb) && date3(dobc) && gens(gender) && sk(skills)) {
       var names = document.getElementById("name").value;
	   var email = document.getElementById("email").value;
    var password = document.getElementById("passw").value;
    var contact = document.getElementById("contact").value;
	   localStorage.setItem('name',names);
	   localStorage.setItem('eml',email);
	   localStorage.setItem('cont',contact);
	   window.location="MemberPage.html";
    }else{
   bootbox.confirm({ 
          title: "User Denied",
          message: "User Requirements Doesnt Fill", 
            callback: function(){ /* your callback code */ }
}) 
}
}

///////////////////////////////////////////


arr1 = [];

function date1(doba) {
    arr1.length = 0;

    for (var i = 0; i < doba.options.length; i++) {
        if (doba.options[i].selected) {
            arr1.push(doba.options[i].value);
        }
    }
    if (arr1.length > 0) {
        return true;
    } else {
        return false;
    }

}

arr2 = [];

//////////////////////////////////////////
function date2(dobb) {
    arr2.length = 0;

    for (var i = 0; i < dobb.options.length; i++) {
        if (dobb.options[i].selected) {
            arr2.push(dobb.options[i].value);
        }
    }
    if (arr2.length > 0) {
        return true;
    } else {
        return false;
    }

}

/////////////////////////////////////////////
arr3 = [];

function date3(dobc) {
    arr3.length = 0;

    for (var i = 0; i < dobc.options.length; i++) {
        if (dobc.options[i].selected) {
            arr3.push(dobc.options[i].value);
        }
    }
    if (arr3.length > 0) {
        return true;
    } else {
        return false;
    }

}
/////////////////////////////////////////////

arr4 = [];

function gens(gender) {
    arr4.length = 0;

    for (var i = 0; i < gender.length; i++) {
        if (gender[i].checked == true) {
            arr4.push(gender[i].value);
        }
    }
    if (arr4.length > 0) {
        return true;
    } else {
        return false;
    }

}
//////////////////////////////////////////

arr5 = [];

function sk(skills) {
    arr5.length = 0;

    for (var i = 0; i < skills.length; i++) {
        if (skills[i].checked == true) {
            arr5.push(skills[i].value);
        }
    }
    if (arr5.length > 0) {
        return true;
    } else {
        return false;
    }

}
