

const container = document.querySelector("body");
container.addEventListener("click",eventos);

/*
const sidebar  = document.querySelector(".toggle-sidebar-btn");
const body = document.querySelector("body");


console.log(sidebar)
sidebar.addEventListener("click",toogleSidebar)
function toogleSidebar(e){
	console.log("cvlick")
	body.classList.toggle('toggle-sidebar')
}
*/
function eventos(e){
	
	if(e.target.matches(".toggle-sidebar-btn")){
		container.classList.toggle('toggle-sidebar')
	}
	if(e.target.dataset.bsToggle ==="dropdown"){
		e.preventDefault();
		console.log("cvlick")
	}
}

const onscroll = function(el, listener) {
	  el.addEventListener('scroll', listener);
	}
