function addPara(){
    const para=document.createElement("p");
    para.innerText="This is new Paragraph";
    para.style.color="red";
    const el=document.getElementById("para");
    el.appendChild(para);
}

function removePara(){
    const el=document.querySelector("p");
    const parent=document.getElementById("para");
    parent.removeChild(el);
}

function removeAll(){
    const el=document.querySelectorAll("p");
    const parent=document.getElementById("para");
    parent.remove(el);
}

const BookData=[
    {Image="",Rice:345},
    {Image="",Rice:500},
    {Image="",Rice:340}
    
]