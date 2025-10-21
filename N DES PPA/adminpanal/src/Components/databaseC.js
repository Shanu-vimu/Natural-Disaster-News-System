import axios from "axios";

const News_URL = 'http://localhost:8080/api/news'; //database conn



export const listnews = () => axios.get(News_URL); //database GEt

export const addnews = (news) => axios.post(News_URL, news); 
export const getnews = (news_id) => axios.get(News_URL + '/' + news_id); 
export const updatenews = (news_id, news) => axios.put(News_URL + '/' + news_id, news);
export const deletenews = (news_id) => axios.delete(News_URL + '/' +news_id);