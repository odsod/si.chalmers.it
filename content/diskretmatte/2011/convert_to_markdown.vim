" https://xkcd.com/208/

" Cut tile from header
g/pass \d/d a
" Clean up latex header junk
0,/\\begin{questions}/d
" Put title back
0pu a
" Reformat title
%s#^.*\(pass \d[^}]*\)}.*$#\1\r=========#g
" Clean up footer junk
/\\end{questions}/,$d
" Clean up newlines
%s#\\\\#\r#g
" Convert question names
%s#\\question{\\bfseries \(.*\)}#\1\r--------#g
" Convert block math
%s#\$\$\(\_.\{-\}\)\$\$#\\\\[ \1 \\\\]#g
" Convert inline math
%s#\$\([^$]\_.\{-\}[^$]\{-\}\)$[^$]\{-\}#\\\\( \1 \\\\)#g
" Clean up parts
%s#^\\begin{parts}$##g
%s#^\\end{parts}$##g
" Convert parts
%s#^\\part\n* *#+ #g
" Convert latex quotes
%s#\`\`\(.\{-\}\)\'\'#"\1"#g
" Convert italics
%s#{\\itshape \(.\{-\}\)}#*\1*#g
" Reset file type
set ft=markdown
